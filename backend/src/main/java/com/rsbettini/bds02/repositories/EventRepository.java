package com.rsbettini.bds02.repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rsbettini.bds02.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}

