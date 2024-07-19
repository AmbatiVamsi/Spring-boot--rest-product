package com.example.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

	@Query("from Event where name = :ename")
	Event findByName(@Param("ename") String name);

}