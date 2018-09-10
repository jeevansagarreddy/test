package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MyDao;

@Service
public class MyService {
	
	@Autowired
	MyDao myDao;

}
