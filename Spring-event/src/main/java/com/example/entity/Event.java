package com.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Event {
	
	@Id
	private int evtId;
	@NotNull(message = "Event name is required")
	private String name;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String description;
    private String organizer;

	
    @JsonIgnore
	@OneToMany(mappedBy="event")
	List<Participant> patList = new ArrayList<Participant>();


	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Event(int evtId, String name, LocalDate date, LocalTime time, String location, String description,
			String organizer, List<Participant> patList) {
		super();
		this.evtId = evtId;
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
		this.description = description;
		this.organizer = organizer;
		this.patList = patList;
	}

	public int getEvtId() {
		return evtId;
	}
	public void setEvtId(int evtId) {
		this.evtId = evtId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public List<Participant> getPatList() {
		return patList;
	}
	public void setPatList(List<Participant> patList) {
		this.patList = patList;
	}
}


