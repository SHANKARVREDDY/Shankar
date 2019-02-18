package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service
public class WishService {
public String generateWishMsg(String uname){
	
	int hour=0;
	Calendar cal=null;
	cal=Calendar.getInstance();
	hour=cal.get(Calendar.HOUR_OF_DAY);
	if(hour<12)
		return "Good Morning"+uname;
	else if(hour<16)
		return "Good AfterNoon "  +uname;
	else if(hour<20)
		return"Good Evening"+uname;
	else
		return "Good Night"+uname;
}
}
