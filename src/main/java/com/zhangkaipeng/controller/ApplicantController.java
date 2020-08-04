package com.zhangkaipeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhangkaipeng.bean.Applicant;
import com.zhangkaipeng.bean.Job;
import com.zhangkaipeng.service.ApplicantService;

@Controller
public class ApplicantController {

	
	@Resource
	private ApplicantService applicantService;
	
	@RequestMapping("list")
	public String list(Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Applicant> list = applicantService.queryApplicant(map);
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("queryjobAll")
	@ResponseBody
	public List<Job> queryJobAll(){
		List<Job> list = applicantService.queryJobAll();
		return list;
	}
	
	@RequestMapping("addApplicant")
	@ResponseBody
	public boolean addApplicant(Applicant applicant){
		try {
			applicantService.addApplicant(applicant);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
