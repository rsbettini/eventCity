package com.rsbettini.bds02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsbettini.bds02.dto.EventDTO;
import com.rsbettini.bds02.services.EventService;

public class EventController {

	@RestController
	@RequestMapping(value = "/events")
	public class EventResource {

	@Autowired
	private EventService service;

	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
		
	}
}
