package com.UST.Hib.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.Hib.Entity.Person;
import com.UST.Hib.Repository.PersonDao;

@RestController
@RequestMapping("Spring-Hib")
public class PersonController {
	
	@Autowired
	private PersonDao persondao;
	
	@PostMapping("/savePerson")
	public String save(@RequestBody Person person) {
		persondao.savePerson(person);
		return "ok saved";
	}
		
	@GetMapping("/getperson")
		public List<Person>getAllPersons(){
		return persondao.getPersons();
		}
}
