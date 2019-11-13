package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//We are using wrapper class because of marshalling problem.
//It cannot convert the List of object into xml.
//SO we are creating the wrapper class as the root xml element and providing the 
//Employee List in it.
//For clearing extra doubts check TestController "/getEmp2" requestmapping :)


@XmlRootElement(name="Employees") 
@XmlAccessorType(XmlAccessType.FIELD)

public class EmployeeWrapper {

	@XmlElement(name="Employee")
	List<Employee>list;

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public EmployeeWrapper(List<Employee> list) {
	//	super();
		this.list = list;
	}

	public EmployeeWrapper() {
		//super();
	}

	
	
}
