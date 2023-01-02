package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Checkin;


@Component
public class CheckinUtil {
public void mapToActualObject(Checkin actual, Checkin CheckinService) {
		
		actual.setPnr(CheckinService.getPnr());
		
	}

}
