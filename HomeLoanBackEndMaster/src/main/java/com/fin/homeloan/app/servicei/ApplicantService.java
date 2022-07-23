package com.fin.homeloan.app.servicei;

import com.fin.homeloan.app.model.Applicant;

public interface ApplicantService {

	void saveApplicant(Applicant a);

	Applicant get(int applicantId);

}
