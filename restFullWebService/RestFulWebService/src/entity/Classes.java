package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Classes")
public class Classes {
	@Id
	@Column(name = "ClassId")
	private String classId;
	@Column(name = "ClassName")
	private String className;
	@OneToMany(mappedBy = "classId")
	private List<Student> listStudent;

	public Classes() {
		super();
	}

	public Classes(String classId, String className, List<Student> listStudent) {
		super();
		this.classId = classId;
		this.className = className;
		this.listStudent = listStudent;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

}
