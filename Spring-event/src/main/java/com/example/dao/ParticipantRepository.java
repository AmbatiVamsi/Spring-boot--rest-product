package com.example.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

	@Query("from Participant where name = :pname")
	Participant findbyName(@Param("pname") String name);

//	@Query("from Participant p where p.emailId = :emailId and e.password = :password")
//	Participant patLogin(@Param("emailId") String emailId, @Param("password") String password);

}

