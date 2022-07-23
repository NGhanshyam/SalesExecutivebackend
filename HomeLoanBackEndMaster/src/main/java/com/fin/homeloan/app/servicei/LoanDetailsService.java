package com.fin.homeloan.app.servicei;

import com.fin.homeloan.app.model.LoanDetails;

public interface LoanDetailsService {
	public LoanDetails saveLoanDetails(LoanDetails l);

	public LoanDetails getByLoanId(int loanDetailId);

}
