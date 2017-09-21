package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.DeptVO;
import com.example.domain.EmpVO;
import com.example.repository.DeptRepository;
import com.example.repository.EmpRepository;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/emp")
@Log
public class EmpController {
	@Inject						// DeptRepository Bean Factory 등록 => DI
	EmpRepository empRepo;
	@GetMapping("/list")
	public String list(Model model){
		// Method Name은 관계 없음. (의미에만 맞게 작명)				
		log.info("/emp/list 호출됨");
		List<EmpVO> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
		// Model => Request application 
		model.addAttribute("emps",emps);
		return "thymeleaf/emp/list";
	}
}
