package com.example.controller;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSrvl {

	@RequestMapping(value = "/send", method = RequestMethod.POST, headers = "Accept=*/*")
	 public String send(@RequestParam(value = "doctorcode") String doctorcode, @RequestParam(value = "yyyy") String yyyy,
	   @RequestParam(value = "mm") String mm, @RequestParam(value = "row") String row, @RequestParam(value = "dataset") String dataset,
	   HttpServletResponse response) {
	  response.setContentType("application/json");
	  response.addHeader("Access-Control-Allow-Origin", "*");

	  System.out.println("Test");
//	  JSONObject obj = new JSONObject();
//	  String map;
//	  try {
//		obj.put("map", "Pass");
//	} catch (JSONException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  map = obj.toString();
//	  
//	  System.out.println(map);
	  
	  return "";
	 }
}
