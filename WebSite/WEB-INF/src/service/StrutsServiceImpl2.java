package service;
import java.util.List;
import dao.intdao.IDaoUser;
public class StrutsServiceImpl2 implements IStrutsService
{
	private IDaoUser du;
	public void setDu(IDaoUser pdu)
	{
		this.du = pdu;
	}
	public List getRecordUser()
	{
		return du.getUserRecord();
	}
}