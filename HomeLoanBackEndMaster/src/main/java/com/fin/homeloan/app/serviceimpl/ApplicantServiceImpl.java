package com.fin.homeloan.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.homeloan.app.model.Applicant;
import com.fin.homeloan.app.repository.ApplicantRepository;
import com.fin.homeloan.app.servicei.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	@Autowired
	ApplicantRepository repository;
	
	@Override
	public void saveApplicant(Applicant a) {
		repository.save(a);

}

	@Override
	public Applicant get(int applicantId) {
		Applicant a=repository.findByapplicantId(applicantId);
		return a;
	}
}