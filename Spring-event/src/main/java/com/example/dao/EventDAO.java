package com.example.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Event;

@Service
public class EventDAO {

	@Autowired
	EventRepository evtRepo;

	public List<Event> getEvents() {
		return evtRepo.findAll();
	}

	public Event getEventById(int evtId) {
		return evtRepo.findById(evtId).orElse(null);
	}

	public Event getEventByName(String name) {
		return evtRepo.findByName(name);
	}
		
	public Event addEvent(Event evt) {
		return evtRepo.save(evt);
	}

	public Event updateEvent(Event evt) {
		return evtRepo.save(evt);
	}

	public void deleteEventById(int evtId) {
		evtRepo.deleteById(evtId);
	}
	
}

