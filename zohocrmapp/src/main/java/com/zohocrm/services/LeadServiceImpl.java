package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Lead;
import com.zohocrm.repositories.LeadRepository;
@Service // if we didn't add this annoation, this class will not maintained by springboot
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead findLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

}
