package com.adil.crud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adil.crud.model.Student;
import com.adil.crud.repo.Studentrepository;

@Controller
public class controller {
	@Autowired
	private Studentrepository repo;
	@RequestMapping(value="/index",method=RequestMethod.GET)
    public String index(Model model) {
	    
		List<Student> stds=repo.findAll();
		model.addAttribute("students", stds);
    	return "students";
    }
	

}
