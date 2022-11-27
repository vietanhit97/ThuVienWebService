package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StuId")
	private int stuId;
	@Column(name = "FullName")
	private String fullName;
	@Column(name = "Gender")
	private Boolean gender;
	@Column(name = "Birthday")
	private Date birthday ;
	@Column(name = "Address")
	private String address;
	@ManyToOne
	@JoinColumn(name = "ClassId" ,referencedColumnName = "ClassId")
	private Classes classId ;
	
	public Student() {
		super();
	}

	public Student(int stuId, String fullName, Boolean gender, Date birthday, String address, Classes classId) {
		super();
		this.stuId = stuId;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.classId = classId;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classes getClassId() {
		return classId;
	}

	public void setClassId(Classes classId) {
		this.classId = classId;
	}
	
} 
