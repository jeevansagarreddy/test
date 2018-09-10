package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.MyService;

@RestController
public class MyController implements CommandLineRunner{
	
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	MyService myService;
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public Student getStudentDetails(@RequestParam("id") int id,@RequestParam("name") String name){
		
		System.out.println(name);
		System.out.println(id);
		Student st = new Student();
		
        st.setName(name);
        st.setId(id);
       
        return  st;
     }
	
    @RequestMapping(value="/jackson", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void studentDetails(@RequestBody Student stu){
		
		System.out.println(stu);
   }

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("perform database operation......");
	}
 }
