package dao.hibernate;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.query.NativeQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojo.User;
public class TestHibernate
{
	public List getUserRecord()
	{
		Session session = HibernateUtils.openSession();
		//Query hqlquery = session.createQuery("from User");
		//List listUser = hqlquery.list();
		NativeQuery sqlquery = session.createNativeQuery("SELECT ID, USER_NAME, PASSWORD FROM USER");
		sqlquery.addEntity(User.class);
		List listUser = sqlquery.getResultList();
		session.close();
		HibernateUtils.closeSessionFactory();
		return listUser;
	}
}
