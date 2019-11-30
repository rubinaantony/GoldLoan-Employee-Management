package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Gold;
import com.example.demo.repository.GoldRepo;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class GoldRestController {
	@Autowired
	GoldRepo repo;

	@GetMapping("/employee/view")
	public List<Gold> view() {

		return repo.findAll();
	}

	@PostMapping("/employee/insert")
	public Gold insert(@RequestBody Gold gold) {

		return repo.save(gold);
	}
	
	@PostMapping("/employee/update")
	public Gold update(@RequestBody Gold gold) {

		return repo.save(gold);
	}
	
	@DeleteMapping("/employee/delete/{id}")
	public List<Gold> delete(@PathVariable Integer id) {

		repo.deleteById(id);
		return repo.findAll();
	}
	

}
