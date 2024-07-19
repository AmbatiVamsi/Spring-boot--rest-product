package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EventDAO;
import com.example.entity.Event;



@RestController
public class EventController {

	@Autowired
	EventDAO evtDAO;
	
	@GetMapping("getEvents")
	public List<Event> getEvents() {
		return evtDAO.getEvents();
	}
	
	@GetMapping("getEventById/{evtId}")
	public Event getEventById(@PathVariable("evtId") int evtId) {
		return evtDAO.getEventById(evtId);
	}
	
	@GetMapping("getEventByName/{EventName}")
	public Event getEventByName(@PathVariable("EventName") String evtName) {
		return evtDAO.getEventByName(evtName);
	}
	
	@PostMapping("addEvent")
	public Event addEvent(@RequestBody Event evt) {
		return evtDAO.addEvent(evt);
	}
	
	@PutMapping("updateEvent")
	public Event updateEvent(@RequestBody Event evt) {
		return evtDAO.updateEvent(evt);
	}
	
	@DeleteMapping("deleteEventById/{evtId}")
	public String deleteEventById(@PathVariable("evtId") int evtId) {
		evtDAO.deleteEventById(evtId);
		return "Event with EventId: " + evtId + ", Deleted Successfully";
	}
	
	
	
	
}
