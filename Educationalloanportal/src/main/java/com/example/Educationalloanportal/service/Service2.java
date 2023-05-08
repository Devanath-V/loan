package com.example.Educationalloanportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Educationalloanportal.model.UserModel;
import com.example.Educationalloanportal.repository.AdminModelRepository;
import com.example.Educationalloanportal.repository.UserModelRepository;

@Service
public class Service2 {

	@Autowired
	AdminModelRepository p3Repo;
	
	@Autowired
	UserModelRepository laRep;


			public List<UserModel> getAllloans()
			{
				return laRep.findAll();
				
			}
			public UserModel saveloan(UserModel l)
			{
				return laRep.save(l);
			}
			
			public void deleteloan(int id)
			{
				laRep.deleteById(id);
			}
			
			public UserModel updateloan (UserModel c,int id)
			{
				Optional<UserModel> eldata=laRep.findById(id);
				if(eldata.isPresent())
				
				{
					return laRep.save(c);
				}
				return null;
			}

}


