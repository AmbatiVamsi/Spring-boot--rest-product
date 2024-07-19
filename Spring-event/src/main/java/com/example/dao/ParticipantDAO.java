package com.example.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Participant;


@Service
public class ParticipantDAO {

	@Autowired
	ParticipantRepository patRepo;

	public List<Participant> getParticipants() {
		return patRepo.findAll();
		
	}
	
	public Participant getParticipantById(long id) {
		return patRepo.findById((long) id).orElse(null);
	}

	public Participant getParticipantByName(String name) {
		return patRepo.findbyName(name);
	}
	
	public Participant addParticipant(Participant pat) {
		return patRepo.save(pat);
	}

	public Participant updateParticipant(Participant pat) {
		return patRepo.save(pat);
	}

	public void deleteParticipantById(long id) {
		patRepo.deleteById((long) id);
	}

//	public Participant patLogin(String emailId, String password) {
//		return patRepo.patLogin(emailId, password);
//	}

	public List<Participant> Participants() {
		// TODO Auto-generated method stub
		return patRepo.findAll();
	}
	
}




