package com.gao.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gao.domain.User;

@Controller
@RequestMapping("fake/users")
public class FakeUserController {

	@GetMapping
	@ResponseBody
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		list.add(new User(1,"关羽",new Date(), 1000d));
		list.add(new User(2,"张飞",new Date(), 2000d));
		list.add(new User(3,"赵云",new Date(), 3000d));
		list.add(new User(4,"马超",new Date(), 4000d));
		list.add(new User(5,"黄忠",new Date(), 5000d));
		return list;
	}
	
	@PostMapping
	@ResponseBody
	public void save(User user) {
		System.out.println("FakeUserController.save(): " + user);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer id) {
		System.out.println("FakeUserController.delete(): " + id);
	}
	
	@PutMapping
	@ResponseBody
	public void update(User user) {
		System.out.println("FakeUserController.update(): " + user);
	}
	
	@GetMapping("{id}")
	@ResponseBody
	public void findOne(@PathVariable Integer id) {
		System.out.println("FakeUserController.findOne(): " + id);
	}
}
