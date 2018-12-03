package com.xxx.entity;

public class User {
	private int id;
	private String username;
	private String name;
	private String sex;
	private String phone;
	private String address;
	private String power;	
	private String password;
	private int loginNum;
	public User() {
		super();
		
	}
	public User(int id, String username, String name, String sex, String phone, String address, String power,
			String password, int loginNum) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.power = power;
		this.password = password;
		this.loginNum = loginNum;
		
	}
	@Override
	public String toString() {
		return "ProductUser [id=" + id + ", username=" + username + ", name=" + name + ", sex=" + sex + ", phone="
				+ phone + ", address=" + address + ", power=" + power + ", password=" + password + ", loginNum="
				+ loginNum + "]";
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(int loginNum) {
		this.loginNum = loginNum;
	}
	public void add(User findProductById) {
		// TODO Auto-generated method stub
		
	}

}
