package entity;

public class Student {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�û���:"+username+"\n����:"+password;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s =(Student)obj;
		if(s.getUsername().equals(this.getUsername())&&s.getPassword().equals(this.getPassword()))
		{
			return true;
		}
		return false;
	}
	
}
