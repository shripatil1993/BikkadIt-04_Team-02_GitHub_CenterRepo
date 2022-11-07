package com.BikkadIt_First_Git_Project.enitity;

public class UserData {

	
	
	private String Name;
     
	private String UserName;
	
	private String Pwd;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserData [Name=" + Name + ", UserName=" + UserName + ", Pwd=" + Pwd + "]";
	}
	
	
}
