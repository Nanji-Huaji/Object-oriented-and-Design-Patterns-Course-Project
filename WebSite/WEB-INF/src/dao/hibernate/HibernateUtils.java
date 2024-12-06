package dao.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtils
{
	private static SessionFactory sessionFactory;
	private static SessionFactory buildSessionFactory()
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(ssr).buildMetadata().buildSessionFactory();
		return sessionFactory;
	}
 	public static SessionFactory getSessionFactory()
	{
  		return (sessionFactory==null ? buildSessionFactory() : sessionFactory);
 	}
 	public static Session openSession()
	{
		return getSessionFactory().openSession();
 	}
	public static void closeSessionFactory()
	{
		if (sessionFactory != null) sessionFactory.close();
		sessionFactory = null;
	}
}