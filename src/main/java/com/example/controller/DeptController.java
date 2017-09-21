package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.DeptVO;
import com.example.repository.DeptRepository;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/dept")
@Log
public class DeptController {
	@Inject						// DeptRepository Bean Factory 등록 => DI
	DeptRepository deptRepo;
	@GetMapping("/list")
	public String list(Model model){
		// Method Name은 관계 없음. (의미에만 맞게 작명)				
		log.info("/dept/list 호출됨");
		List<DeptVO> depts = deptRepo.findAll();
		depts.forEach(e -> System.out.println(e));
		// Model => Request application 
		model.addAttribute("depts",depts);
		
		return "jsp/dept/list";
	}
}
