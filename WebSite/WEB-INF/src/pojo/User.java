package pojo;
import java.io.Serializable;
public class User implements Serializable
{
	private int id;
	private String username;
	private String password;
	public int getId()
	{
		return id;
	}
	public void setId(int pid)
	{
		this.id = pid;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String pusername)
	{
		this.username = pusername;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String ppassword)
	{
		this.password = ppassword;
	}
}