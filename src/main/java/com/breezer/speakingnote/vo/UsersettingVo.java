package com.breezer.speakingnote.vo;

public class UsersettingVo {
	private long idx;
	private String userId;
	private String languageKind;
	private String scret;
	
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLanguageKind() {
		return languageKind;
	}
	public void setLanguageKind(String languageKind) {
		this.languageKind = languageKind;
	}
	public String getScret() {
		return scret;
	}
	public void setScret(String scret) {
		this.scret = scret;
	}
	
	
	@Override
	public String toString() {
		return "UsersettingVo [idx=" + idx + ", userId=" + userId + ", languageKind=" + languageKind + ", scret="
				+ scret + "]";
	}
	
	
	
	
}
