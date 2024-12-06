package struts;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import java.util.List;

import service.IStrutsService;
import service.StrutsServiceImpl2;
public class TestStruts2 extends ActionSupport
{
	private IStrutsService iss;
	private List listUser;
	public void setIss(IStrutsService pIss)
	{
		this.iss = pIss;
	}
	public IStrutsService getIss()
	{
		return iss;
	}
	public List getListUser()
	{
		return this.listUser;
	}
	public void setListUser(List pListuser)
	{
		this.listUser = pListuser;
	}
	public String execute() throws Exception
	{
		setListUser(iss.getRecordUser());
		return SUCCESS;
	}
}
