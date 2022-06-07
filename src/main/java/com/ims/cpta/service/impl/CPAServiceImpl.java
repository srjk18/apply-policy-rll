package com.ims.cpta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.cpta.repo.CPARepo;
import com.ims.cpta.service.CPAService;
import com.ims.ctpa.entity.CustomerPolicyApply;

@Service
public class CPAServiceImpl implements CPAService{
	
	
	@Autowired
	private CPARepo cpaRepo;

	@Override
	public CustomerPolicyApply createCustomer(CustomerPolicyApply customer) throws Exception {
		
		return this.cpaRepo.save(customer);
		
	}

	@Override
	public CustomerPolicyApply getCustomer(String CustomerEmail) {

		return this.cpaRepo.findByeEmail(CustomerEmail);

	}

	@Override
	public void deleteCustomer(Long id) {
		
		this.cpaRepo.deleteById(id);
	}

	@Override
	public CustomerPolicyApply updateCustomer(CustomerPolicyApply cs) {
		CustomerPolicyApply cpsa = cpaRepo.findById(cs.getId()).orElse(null);
		cpsa.setCustomerName(cs.getCustomerName());
		return this.cpaRepo.save(cpsa);
	}

	

}
