package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Checkin {
	@Id
private String pnr;
private String email;
private String name;
public String getPnr() {
	return pnr;
}
public void setPnr(String pnr) {
	this.pnr = pnr;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
