package domain_07_05_2021;

import java.io.Serializable;

public class LoginUser implements Serializable
{
	public LoginUser() {
		System.out.println("deafult Constructor");
	}
private String uname;
private String upass;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
@Override
public String toString() {
	return "LoginUser [uname=" + uname + ", upass=" + upass + "]";
}
public boolean isValidate() {
	boolean b=false;
	//if(uname.equalsIgnoreCase(arg0))
	return b;
	
}
}
