package com.fin.homeloan.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.homeloan.app.model.LoanDetails;
import com.fin.homeloan.app.repository.LoanDetailsRepository;
import com.fin.homeloan.app.servicei.LoanDetailsService;
@Service
public class LoanDeatislServiceImpl implements LoanDetailsService {
	
	@Autowired
	LoanDetailsRepository rep;

	@Override
	public LoanDetails saveLoanDetails(LoanDetails l) {

		return rep.save(l);
	}

	@Override
	public LoanDetails getByLoanId(int loanDetailId) {
		LoanDetails l = rep.findByloanDetailId(loanDetailId);
		return l;
	}

}
