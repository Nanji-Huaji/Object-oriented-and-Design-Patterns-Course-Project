package struts;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import dao.JdbcVisitDb;
import dao.hibernate.TestHibernate;
public class TestStruts1 extends ActionSupport
{
	private String username = "";
	private String password = "";
	private String retVal = "";
	private List listUser;
	public String getUsername()
	{
		return this.username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getRetVal()
	{
		return retVal;
	}
	public void setRetVal(String val)
	{
		this.retVal = val;
	}
	public List getListUser()
	{
		return this.listUser;
	}
	public String execute() throws Exception
	{
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		retVal = username + password;
		TestHibernate th = new TestHibernate();
		listUser = new JdbcVisitDb().getUserRecord();
		if (new JdbcVisitDb().checkLogin(username, password)) System.out.println("用户登录成功");
		else System.out.println("用户登录失败");
		//listUser = th.getUserRecord();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("retVal", "request" + retVal);

		return "bupt";
	}
}
