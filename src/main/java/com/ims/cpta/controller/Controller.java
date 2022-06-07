package com.ims.cpta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ims.cpta.service.CPAService;
import com.ims.ctpa.entity.CustomerPolicyApply;


@RestController
@RequestMapping("/csmt")
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	private CPAService cpaService;
	
    //creating user
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerPolicyApply createCustomer(@RequestBody CustomerPolicyApply cspa) throws Exception {

        return this.cpaService.createCustomer(cspa);

    }
    
    
    @GetMapping("/{CustomerName}")
    public CustomerPolicyApply getCustomer(@PathVariable("CustomerName") String CustomerName) {
        return this.cpaService.getCustomer(CustomerName);
    }

    //delete the user by id
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        this.cpaService.deleteCustomer(id);
    }
    
    //update API
    @PutMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@PathVariable("id") CustomerPolicyApply cpa) {
        this.cpaService.updateCustomer(cpa);
    }


}
