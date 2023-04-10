package com.ssafy.mini.vo;

import java.sql.Date;

public class User {
	
	private int userNo; // DB PK
	private String id; // 아이디
	private String password; // 비밀번호
	private String name; // 이름
	private int age; // 나이
	private String phone; // 전화번호(xxx-xxxx-xxxx 형태로 받기위해 string)
	private String email; // 이메일
	private String nickName; // 닉네임
	private Date createDate; // 생성날짜
	private Date updateDate; // 계정 최근 활동 날짜
	private char status; // 회원 상태
	
	public User() {
		super();
	}

	public User(int userNo, String id, String password, String name, int age, String phone, String email,
			String nickName, Date createDate, Date updateDate, char status) {
		super();
		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.nickName = nickName;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.status = status;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", id=" + id + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", phone=" + phone + ", email=" + email + ", nickName=" + nickName + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", status=" + status + "]";
	}
	
	
	
}
