package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import dao.ClassDaoImp;
import entity.Classes;
import entity.ClassesDTO;

@Path(value = "/Class")
public class ClassService {
	@GET
	@Path(value = "/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public String getList() {
		List<Classes> listClass = new ClassDaoImp().getListClasses();
		Gson gson = new Gson();
		List<ClassesDTO> listClassDto = new ArrayList<ClassesDTO>();
		for (Classes c : listClass) {
			ClassesDTO cdto = new ClassesDTO(c.getClassId(), c.getClassName());
			listClassDto.add(cdto);
		}
		String data = gson.toJson(listClassDto);
		return data;
	}
}
