package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.CheckinRepository;

import com.example.demo.entity.Checkin;

import com.example.demo.service.CheckinService;

import com.example.demo.util.CheckinUtil;
@RestController
@RequestMapping("/rest/checkin")
@CrossOrigin
public class CheckinController {




	private Logger log = LoggerFactory.getLogger(BookTicketController.class);

	@Autowired
	private CheckinService service;
	@Autowired
	private CheckinUtil util;
	@Autowired
	private CheckinRepository feed;
	
	@PostMapping("/save")
public ResponseEntity<String> saveCheckin(
			@RequestBody Checkin checkin)
	{
		log.info("Entered into method with BookTicket data to save");

		ResponseEntity<String> resp = null;
		try {

			log.info("About to call save Operation");

			String email = service.saveCheckin(checkin);
			log.debug("Checkin saved with id "+email);

			String body = "Checkin '"+email+"' added successfully";

			resp =  new ResponseEntity<String>(body, HttpStatus.CREATED); //201

			log.info("Sucess response constructed");
		} catch (Exception e) {
			log.error("Unable to save BookTicket : problem is :"+e.getMessage());
			resp =  new ResponseEntity<String>(
					"Unable to Create BookTicket", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500
			e.printStackTrace();
		}

		log.info("About to Exist save method with Response");
		return resp;
	}}
	
	



