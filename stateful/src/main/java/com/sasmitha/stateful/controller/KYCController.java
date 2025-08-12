package com.sasmitha.stateful.controller;

import com.sasmitha.stateful.model.Customer;
import com.sasmitha.stateful.model.CustomerAddress;
import com.sasmitha.stateful.model.CustomerProfile;
import com.sasmitha.stateful.service.KYCServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer/register")
public class KYCController {

    private final KYCServiceImp kycServiceImp;

    @PostMapping("/profile")
    ResponseEntity<?> saveProfile(@RequestBody CustomerProfile profile) {
        kycServiceImp.saveProfile(profile);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/address")
    ResponseEntity<?> saveAddress(@RequestBody CustomerAddress address) {
        kycServiceImp.saveAddress(address);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/approve")
    ResponseEntity<Customer> approve() {
        Customer customer = kycServiceImp.approve();
        return ResponseEntity.ok(customer);
    }
}
