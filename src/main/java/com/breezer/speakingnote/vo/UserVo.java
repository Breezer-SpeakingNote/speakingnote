package com.breezer.speakingnote.vo;

public class UserVo {
	private long idx;
	private String id;
	private String password;
	private String nickName;
	private String profileImage;
	private String profile;
	private String emailAuth;
	private String session;
	private String device;
	private String phone;
	private String gender;
	private String birth;
	private String joinDate;
	private String lastLoginDate;
	private String role;
	
	
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getEmailAuth() {
		return emailAuth;
	}
	public void setEmailAuth(String emailAuth) {
		this.emailAuth = emailAuth;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "UserVo [idx=" + idx + ", id=" + id + ", password=" + password + ", nickName=" + nickName
				+ ", profileImage=" + profileImage + ", profile=" + profile + ", emailAuth=" + emailAuth + ", session="
				+ session + ", device=" + device + ", phone=" + phone + ", gender=" + gender + ", birth=" + birth
				+ ", joinDate=" + joinDate + ", lastLoginDate=" + lastLoginDate + ", role=" + role + "]";
	}
	
	
	
	
	
}
