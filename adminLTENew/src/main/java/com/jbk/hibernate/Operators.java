package com.jbk.hibernate;
// Generated Apr 29, 2020 10:33:47 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OperatorsId generated by hbm2java
 */
@Entity
@Table(name = "operators", catalog = "hb")
public class Operators implements java.io.Serializable {

	private int id;
	private String person;
	private String forr;
	private String preferedway;
	private String contact;
	private String timings;

	public Operators() {
	}

	public Operators(int id, String person, String forr, String preferedway, String contact, String timings) {
		this.id = id;
		this.person = person;
		this.forr = forr;
		this.preferedway = preferedway;
		this.contact = contact;
		this.timings = timings;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "person", length = 45)
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Column(name = "forr", length = 90)
	public String getForr() {
		return this.forr;
	}

	public void setForr(String forr) {
		this.forr = forr;
	}

	@Column(name = "preferedway", length = 45)
	public String getPreferedway() {
		return this.preferedway;
	}

	public void setPreferedway(String preferedway) {
		this.preferedway = preferedway;
	}

	@Column(name = "contact", length = 45)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "timings", length = 90)
	public String getTimings() {
		return this.timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

}
