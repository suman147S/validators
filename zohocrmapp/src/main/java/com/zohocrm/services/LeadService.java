package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entites.Lead;
//we create this service layer because to keep more secure
public interface LeadService {
	public void saveOneLead (Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

	public Lead findLead(long id);
}
