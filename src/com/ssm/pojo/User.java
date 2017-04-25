package com.ssm.pojo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long SerializableUID = 1L;
	private int userId;;
	private String userName;
	private String userPassword;
	private String userSex;

	public User(int userId,String userName,String userPassword,String userSex){
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public static long getSerializableuid() {
		return SerializableUID;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userSex="
				+ userSex + "]";
	}

}
