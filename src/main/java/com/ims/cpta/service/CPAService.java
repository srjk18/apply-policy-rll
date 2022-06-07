package com.ims.cpta.service;

import com.ims.ctpa.entity.CustomerPolicyApply;

public interface CPAService {
	
    //creating Customer
    public CustomerPolicyApply createCustomer(CustomerPolicyApply customer) throws Exception;

    //get user by CustomerName
    public CustomerPolicyApply getCustomer(String CustomerEmail);

    //delete user by id
    public void deleteCustomer(Long id);
    
    
    // update by user id    
    public CustomerPolicyApply updateCustomer(CustomerPolicyApply cs);
    
    



}
