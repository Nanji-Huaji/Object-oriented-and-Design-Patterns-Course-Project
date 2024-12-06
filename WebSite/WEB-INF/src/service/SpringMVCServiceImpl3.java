package service;
import java.util.List;
import dao.intdao.IDaoUser;
public class SpringMVCServiceImpl3 implements IStrutsService
{
	private IDaoUser ud;
	public void setUd(IDaoUser pud)
	{
		this.ud = pud;
	}
	public List getRecordUser()
	{
		return ud.getUserRecord();
	}
}