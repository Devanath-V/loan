package com.example.Educationalloanportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Educationalloanportal.model.UserModel;
import com.example.Educationalloanportal.service.Service2;

public class Controller2 {

	@Autowired
	Service2 s2;
	
	@GetMapping("/getloandata")
	public List<UserModel> getloandata()
	{
		
	return s2.getAllloans();
	}
	
	@PostMapping("/saveloan")
	public UserModel saveloan(@RequestBody UserModel l)
	{
		return s2.saveloan(l);
	}
	
	@PutMapping("/ln/{loanId}")
	
		public UserModel updateuser (@RequestBody UserModel u, @PathVariable("loanId") int loanId)
		{
		return s2.updateloan(u,loanId);
		}
	
	@DeleteMapping("/ln/{loanId}")
	public String  deleteconnection(@PathVariable("loanId") int loanId)
	{
		s2.deleteloan(loanId);
		return "Deleted";
	}
	

}
