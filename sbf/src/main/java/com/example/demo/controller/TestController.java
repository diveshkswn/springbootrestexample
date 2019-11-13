package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.bean.EmployeeWrapper;


@RestController
public class TestController {

	
	@RequestMapping(value="/getList",produces=MediaType.APPLICATION_JSON_VALUE)
	public String check() {
		String result="Welcome to Spring Boot Application!!!"+"\r\n";
		String name[]=new String[10];
		for(int i=0; i<10; i++) {
			name[i]=(char)(i+65)+"ivesh";
			
		}
		int id[]=new int[10];
		
		for(int i=0; i<10; i++) {
			id[i]=i;
		}
		
		result=result+"\r\n"+"| ID"+"|"+"Name |";
		
		for(int i=0; i<10; i++) {
			result=result+"\r\n |"+id[i]+"|"+name[i]+" |";
		}
		return result;
		
		
		
		
	}
	
	@GetMapping("/")
	public String check2(){
		return "Spring Boot Application!!!";
	}
	
	
	@GetMapping("/getEmp")
	public List<Employee> getEmployeeDetails(){
		
		Employee e1=new Employee(101, "Divesh", 225000);
		Employee e2=new Employee(102, "Salman", 225000);
		List<Employee>li=new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		
		return li;
	}
	
	
	
	@RequestMapping(value="/getEmp2",produces=MediaType.APPLICATION_XML_VALUE)
	public EmployeeWrapper getEmployeeDetails2(){
		
		Employee e1=new Employee(101, "Divesh", 22500);
		Employee e2=new Employee(102, "Salman", 22500);
		Employee e3=new Employee(103,"Sahil", 22500);
		List<Employee>li=new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		EmployeeWrapper ew=new EmployeeWrapper(li);
		return ew;
	}
}
