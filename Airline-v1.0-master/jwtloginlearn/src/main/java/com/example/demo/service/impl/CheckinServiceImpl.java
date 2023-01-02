package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CheckinRepository;

import com.example.demo.entity.Checkin;

import com.example.demo.service.CheckinService;

@Service
public class CheckinServiceImpl implements CheckinService {

	@Autowired
	private CheckinRepository repo;
	
	@Override
	public String saveCheckin(Checkin f) {
		f = repo.save(f);
		return f.getPnr();
	}


	
}
