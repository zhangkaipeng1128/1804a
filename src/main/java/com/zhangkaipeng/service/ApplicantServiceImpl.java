package com.zhangkaipeng.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangkaipeng.bean.Applicant;
import com.zhangkaipeng.bean.Job;
import com.zhangkaipeng.mapper.ApplicantMapper;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	
	@Resource
	private ApplicantMapper applicantMapper;
	@Override
	public List<Applicant> queryApplicant(Map<String, Object> map) {

		return applicantMapper.queryApplicant(map);
	}
	@Override
	public List<Job> queryJobAll() {

		return applicantMapper.queryJobAll();
	}
	@Override
	public void addApplicant(Applicant applicant) {
		applicantMapper.addApplicant(applicant);
		
	}

}
