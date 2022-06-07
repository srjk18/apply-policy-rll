package com.ims.cpta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ims.ctpa.entity.CustomerPolicyApply;


public interface CPARepo extends JpaRepository<CustomerPolicyApply, Long> {
	
    public CustomerPolicyApply findByeEmail(String CustomerEmail);

}


