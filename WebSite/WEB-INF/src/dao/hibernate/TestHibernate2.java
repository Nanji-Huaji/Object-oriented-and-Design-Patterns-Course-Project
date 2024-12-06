package dao.hibernate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;
import dao.intdao.IDaoUser;
public class TestHibernate2 implements IDaoUser
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory pSsff)
	{
		this.sessionFactory = pSsff;
	}
	public SessionFactory getSessionFactory()
	{
		return this.sessionFactory;
	}
	public List getUserRecord()
	{
		System.out.println("=====getUserRecord()=====");
		Session session = sessionFactory.openSession();
		Query hqlquery = session.createQuery("from User");
		List listUser = hqlquery.list();
		//NativeQuery sqlquery = session.createNativeQuery("SELECT ID, USER_NAME, PASSWORD FROM USER");
		//sqlquery.addEntity(User.class);
		//List listUser = sqlquery.getResultList();
		session.close();
		return listUser;
	}
}
