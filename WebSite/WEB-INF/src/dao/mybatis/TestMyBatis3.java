package dao.mybatis;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;
import dao.intdao.IDaoUser;
public class TestMyBatis3 extends SqlSessionDaoSupport implements IDaoUser
{
  public List getUserRecord()
  {
    SqlSession sqlSession = this.getSqlSession();
    List listUser = sqlSession.selectList("dao.mybatis.TestMyBatis3.findAllUser");
    return listUser;
  }
}
