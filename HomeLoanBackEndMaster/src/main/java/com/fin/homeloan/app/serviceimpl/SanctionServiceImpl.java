package com.fin.homeloan.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.homeloan.app.model.Applicant;
import com.fin.homeloan.app.model.Sanction;
import com.fin.homeloan.app.repository.ApplicantRepository;
import com.fin.homeloan.app.repository.SanctionRepository;
import com.fin.homeloan.app.servicei.SanctionService;

@Service
public class SanctionServiceImpl implements SanctionService {
	
	@Autowired
	SanctionRepository rep;
	@Autowired
	ApplicantRepository repa;

	@Override
	public void saveSanction(Sanction s) {
		rep.save(s);
	}
	
}
