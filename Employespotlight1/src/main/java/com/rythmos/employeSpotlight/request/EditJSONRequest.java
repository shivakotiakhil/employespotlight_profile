package com.rythmos.employeSpotlight.request;

import java.util.List;

public class  EditJSONRequest  {
	private String cert;
	private String desg;
	private List<String> skill;
	private String Experience;
	private List<String> intrests;
	private String edu;
	private Long id;
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public List<String> getSkill() {
		return skill;
	}
	public void setSkill(List<String> skill) {
		this.skill = skill;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public List<String> getIntrests() {
		return intrests;
	}
	public void setIntrests(List<String> intrests) {
		this.intrests = intrests;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EditJSONRequest [cert=" + cert + ", desg=" + desg + ", skill=" + skill + ", Experience=" + Experience
				+ ", intrests=" + intrests + ", edu=" + edu + ", id=" + id + "]";
	}
	
	
}