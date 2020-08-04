package com.zhangkaipeng.service;

import java.util.List;
import java.util.Map;

import com.zhangkaipeng.bean.Applicant;
import com.zhangkaipeng.bean.Job;

public interface ApplicantService {

	public List<Applicant> queryApplicant(Map<String, Object> map);

	public List<Job> queryJobAll();
	
	public void addApplicant(Applicant applicant);
}
