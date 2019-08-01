package com.rythmos.employeSpotlight.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "UserProfile")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column
	private String cert;
	
	@Column
	private String desg;

	@Column
	private String edu;

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@Embedded
	private List<String> skill;
	

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@Embedded
	private List<String> intrests;

	@Column
	private String Experience;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCert() {
		return cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesc(String desg) {
		this.desg = desg;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> string) {
		this.skill = string;
	}

	public List<String> getIntrests() {
		return intrests;
	}

	public void setIntrests(List<String> intrests) {
		this.intrests = intrests;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", cert=" + cert + ", email=" + desg + ", edu=" + edu + ", skill=" + skill
				+ ", intrests=" + intrests + ", Experience=" + Experience + "]";
	}

}