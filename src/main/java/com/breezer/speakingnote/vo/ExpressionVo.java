package com.breezer.speakingnote.vo;

public class ExpressionVo {
	private long idx;
	private String userId;
	private String korean;
	private String koreanRecordPath;
	private String expression;
	private String expressionRecordPath;
	private String expressionKind;
	private String languageKind;
	private String scret;
	private String important;
	private long share;
	private String providerId;
	private long favorite;
	
	
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
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getKoreanRecordPath() {
		return koreanRecordPath;
	}
	public void setKoreanRecordPath(String koreanRecordPath) {
		this.koreanRecordPath = koreanRecordPath;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getExpressionRecordPath() {
		return expressionRecordPath;
	}
	public void setExpressionRecordPath(String expressionRecordPath) {
		this.expressionRecordPath = expressionRecordPath;
	}
	public String getExpressionKind() {
		return expressionKind;
	}
	public void setExpressionKind(String expressionKind) {
		this.expressionKind = expressionKind;
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
	public String getImportant() {
		return important;
	}
	public void setImportant(String important) {
		this.important = important;
	}
	public long getShare() {
		return share;
	}
	public void setShare(long share) {
		this.share = share;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public long getFavorite() {
		return favorite;
	}
	public void setFavorite(long favorite) {
		this.favorite = favorite;
	}
	
	
	@Override
	public String toString() {
		return "ExpressionVo [idx=" + idx + ", userId=" + userId + ", korean=" + korean + ", koreanRecordPath="
				+ koreanRecordPath + ", expression=" + expression + ", expressionRecordPath=" + expressionRecordPath
				+ ", expressionKind=" + expressionKind + ", languageKind=" + languageKind + ", scret=" + scret
				+ ", important=" + important + ", share=" + share + ", providerId=" + providerId + ", favorite="
				+ favorite + "]";
	}
	
}
