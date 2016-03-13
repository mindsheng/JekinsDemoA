package com.entity;

/*
 * userinfo类对应数据库中一个表userinfo
 */
public class userinfo {
	private int id;
	private String username;
	private String password;
	private String department_id;
	private String priv;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String departmentId) {
		department_id = departmentId;
	}
	public String getPriv() {
		return priv;
	}
	public void setPriv(String priv) {
		this.priv = priv;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "test [department_id=" + department_id + ", email=" + email
				+ ", id=" + id + ", password=" + password + ", priv=" + priv
				+ ", username=" + username + "]";
	}
	
	
}
