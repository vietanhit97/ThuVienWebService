package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.StudentDaoImp;
import entity.Classes;
import entity.Student;
import entity.StudentDTO;

@Path(value = "/Student")
public class StudentService {
	@GET
	@Path(value = "/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public String getList() {
		List<Student> listStudent = new StudentDaoImp().getListStudent();
		Gson gson = new Gson();
		List<StudentDTO> listStudentDto = new ArrayList<StudentDTO>();
		for (Student student : listStudent) {
			StudentDTO stdto = new StudentDTO(student.getStuId(), student.getFullName(), student.getGender(),
					student.getBirthday(), student.getAddress(), student.getClassId().getClassId());
			listStudentDto.add(stdto);
		}
		String data = gson.toJson(listStudentDto);
		return data;
	}

	@POST
	@Path("/insertSutdent")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertCity(String c) {
		Gson son = new Gson();
		StudentDTO objDTO = son.fromJson(c, StudentDTO.class);
		Classes objClasses = new Classes();
		objClasses.setClassId(objDTO.getClassId());
		Student s = new Student(0, objDTO.getFullName(), objDTO.getGender(), objDTO.getBirthday(), objDTO.getAddress(),
				objClasses);
		boolean bl = new StudentDaoImp().insertStudent(s);
		String data = son.toJson(bl);
		return data;
	}

	@DELETE
	@Path("/deleteStudent/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteCity(@PathParam("id") Integer id) {
		Gson son = new Gson();
		boolean bl = new StudentDaoImp().deleteStudent(id);
		String data = son.toJson(bl);
		return data;
	}

	@GET
	@Path("/getStudent/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getStudent(@PathParam("id") Integer id) {
		Gson son = new Gson();
		Student s = new StudentDaoImp().getStudentById(id);
		StudentDTO sdto = new StudentDTO(s.getStuId(), s.getFullName(), s.getGender(), s.getBirthday(), s.getAddress(),
				s.getClassId().getClassId());
		String data = son.toJson(sdto);
		return data;
	}

	@POST
	@Path("/updateStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateCity(String c) {
		Gson son = new Gson();
		StudentDTO objDTO = son.fromJson(c, StudentDTO.class);
		Classes objClasses = new Classes();
		objClasses.setClassId(objDTO.getClassId());
		Student s = new Student(objDTO.getStuId(), objDTO.getFullName(), objDTO.getGender(), objDTO.getBirthday(), objDTO.getAddress(),
				objClasses);
		boolean bl = new StudentDaoImp().updateStudent(s);
		String data = son.toJson(bl);
		return data;
	}
}
