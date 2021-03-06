package com.gaokan.essay.bean;

public class EssayPicPostRequest {
	private String userId;
	private int essayType;
	private int essayId;
	private EssayData data;
	private String picName;
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public EssayData getData() {
		return data;
	}
	public void setData(EssayData data) {
		this.data = data;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getEssayType() {
		return essayType;
	}
	public void setEssayType(int essayType) {
		this.essayType = essayType;
	}
	public int getEssayId() {
		return essayId;
	}
	public void setEssayId(int essayId) {
		this.essayId = essayId;
	}
}
