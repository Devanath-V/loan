package com.example.Educationalloanportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Educationalloanportal.model.LoanApplicationModel;
import com.example.Educationalloanportal.service.Service1;


@RestController
public class Controller1 {

	@Autowired
	Service1 s1;
	
	@GetMapping("/getloandata")
	public List<LoanApplicationModel> getloandata()
	{
		
	return s1.getAllloans();
	}
	
	@PostMapping("/saveloan")
	public LoanApplicationModel saveloan(@RequestBody LoanApplicationModel l)
	{
		return s1.saveloan(l);
	}
	
	@PutMapping("/update/{loanId}")
	
		public LoanApplicationModel updateuser (@RequestBody LoanApplicationModel u, @PathVariable("loanId") int loanId)
		{
		return s1.updateloan(u,loanId);
		}
	
	@DeleteMapping("/ln/{loanId}")
	public String  deleteconnection(@PathVariable("loanId") int loanId)
	{
		s1.deleteloan(loanId);
		return "Deleted";
	}

	
}
