package com.example.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyControllerTest {
	
	@Autowired
	private MyController myController;

	@Test
	public void getStudentDetailsTest() {
		Student std=myController.getStudentDetails(1, "Bannu");
		System.out.println(std);
		Assert.assertEquals(std.getId(), 1);
		
	}

}
