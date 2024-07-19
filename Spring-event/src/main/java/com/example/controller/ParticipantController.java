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
import com.example.dao.ParticipantDAO;
import com.example.entity.Participant;



@RestController
public class ParticipantController {

	@Autowired
	ParticipantDAO patDao;
	
	@Autowired
	EventDAO evtDao;
	
	
//	@GetMapping("patLogin/{emailId}/{password}")
//	public Participant patLogin(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {
//		return patDao.patLogin(emailId, password);
//	}
	
	//https://localhost:8085/getParticipants
	@GetMapping("getParticipants")
	public List<Participant> getParticipants() {
		return patDao.Participants();
	}
	
	@GetMapping("getParticipantById/{id}")
	public Participant getParticipantById(@PathVariable("id") long id) {
		return patDao.getParticipantById(id);
	}
	
	@GetMapping("getParticipantByName/{name}")
	public Participant getParticipantByName(@PathVariable("name") String name) {
		return patDao.getParticipantByName(name);
	}
	
	@PostMapping("addParticipant")
	public Participant addParticipant(@RequestBody Participant pat) {
		return patDao.addParticipant(pat);
	}

	@PutMapping("updateParticipant")
	public Participant updateParticipant(@RequestBody Participant pat) {
		return patDao.updateParticipant(pat);
	}
	
	@DeleteMapping("deleteParticipantById/{id}")
	public String deleteParticipantById(@PathVariable("id") long id) {
		patDao.deleteParticipantById(id);
		return "Participant with patId: " + id + ", Deleted Successfully";
	}
	
	
	
}



