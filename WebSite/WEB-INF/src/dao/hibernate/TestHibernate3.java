package dao.hibernate;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pojo.User;
import dao.intdao.IDaoUser;
public class TestHibernate3 extends HibernateDaoSupport implements IDaoUser
{
	public List getUserRecord()
	{
		DetachedCriteria criteria=DetachedCriteria.forClass(User.class);
		List listUser = this.getHibernateTemplate().findByCriteria(criteria);
		//Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		//Query hqlquery = session.createQuery("from User order by id desc");
		//List listUser = hqlquery.list();
		//NativeQuery sqlquery = session.createNativeQuery("SELECT ID, USER_NAME, PASSWORD FROM USER");
		//sqlquery.addEntity(User.class);
		//List listUser = sqlquery.getResultList();
		//session.close();
		return listUser;
	}
}
