package dao;

import java.util.List;
import entity.Student;
public interface StudentDao {
	public List<Student> getListStudent();

	public Student getStudentById(Integer id);

	public boolean insertStudent(Student s);

	public boolean updateStudent(Student s);

	public boolean deleteStudent(Integer id);

	public List<Student> getStudentByClassName(String countryName);
}
