package com.example.Educationalloanportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Educationalloanportal.model.LoanApplicationModel;
import com.example.Educationalloanportal.repository.LoanApplicationModelRepository;
//import com.example.Educationalloanportal.model.LoginModel;
//import com.example.Educationalloanportal.model.UserModel;
//import com.example.Educationalloanportal.repository.LoginModelRepository;



@Service
public class Service1 {

	@Autowired
	LoanApplicationModelRepository p1Repo;
	public List<LoanApplicationModel> getAllloans()
	{
		return p1Repo.findAll();
		
	}
	public LoanApplicationModel saveloan(LoanApplicationModel l)
	{
		return p1Repo.save(l);
	}
	
	public void deleteloan(int id)
	{
		p1Repo.deleteById(id);
	}
	
	public LoanApplicationModel updateloan (LoanApplicationModel c,int id)
	{
		Optional<LoanApplicationModel> eldata=p1Repo.findById(id);
		if(eldata.isPresent())
		
		{
			return p1Repo.save(c);
		}
		return null;
	}


}
