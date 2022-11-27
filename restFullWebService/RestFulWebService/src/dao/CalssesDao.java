package dao;

import java.util.List;
import entity.Classes;
public interface CalssesDao {
	public List<Classes> getListClasses();

	public Classes getClassById(Integer id);

	public boolean insertStudent(Classes c);

	public boolean updateStudent(Classes c);

	public boolean deleteStudent(Integer id);

	public List<Classes> getClassesByName(String Name);
}
