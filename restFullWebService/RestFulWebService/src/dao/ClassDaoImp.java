package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Classes;
import util.HibernateUtil;

public class ClassDaoImp implements CalssesDao {

	@Override
	public List<Classes> getListClasses() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			List list = session.createCriteria(Classes.class).list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public Classes getClassById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertStudent(Classes c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Classes c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Classes> getClassesByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

}
