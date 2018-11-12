package com.cg.rms.bean;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Candidate_Personal")

public class CandidatePersonal {
	
@Id
 String candidate_id;
 String candidae_name;
 String address;
 Date dob;
 String email_id;
 String contact_number;
 String maritial_status;
 String gender;
 String passport_number;
 Blob candidate_photo;
public String getCandidate_id() {
	return candidate_id;
}
public void setCandidate_id(String candidate_id) {
	this.candidate_id = candidate_id;
}
public String getCandidae_name() {
	return candidae_name;
}
public void setCandidae_name(String candidae_name) {
	this.candidae_name = candidae_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getContact_number() {
	return contact_number;
}
public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}
public String getMaritial_status() {
	return maritial_status;
}
public void setMaritial_status(String maritial_status) {
	this.maritial_status = maritial_status;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassport_number() {
	return passport_number;
}
public void setPassport_number(String passport_number) {
	this.passport_number = passport_number;
}
public Blob getCandidate_photo() {
	return candidate_photo;
}
public void setCandidate_photo(Blob candidate_photo) {
	this.candidate_photo = candidate_photo;
}
@Override
public String toString() {
	return "CandidatePersonal [candidate_id=" + candidate_id + ", candidae_name=" + candidae_name + ", address="
			+ address + ", dob=" + dob + ", email_id=" + email_id + ", contact_number=" + contact_number
			+ ", maritial_status=" + maritial_status + ", gender=" + gender + ", passport_number=" + passport_number
			+ ", candidate_photo=" + candidate_photo + "]";
}

 
 
}
