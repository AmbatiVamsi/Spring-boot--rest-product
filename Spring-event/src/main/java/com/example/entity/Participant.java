package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Participant {

	@Id@GeneratedValue
	private Long id;
	@NotNull(message = "Participant name is required")
    private String name;
    private String email;
    private String phone;
    private String registrationStatus;

	
	@ManyToOne
	Event event;


	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Participant(Long id, String name, String email, String phone, String registrationStatus, Event event) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.registrationStatus = registrationStatus;
		this.event = event;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getRegistrationStatus() {
		return registrationStatus;
	}


	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", registrationStatus=" + registrationStatus + ", event=" + event + "]";
	}
	
}