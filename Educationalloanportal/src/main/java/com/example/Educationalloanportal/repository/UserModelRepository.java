package com.example.Educationalloanportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Educationalloanportal.model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Integer>{

}
