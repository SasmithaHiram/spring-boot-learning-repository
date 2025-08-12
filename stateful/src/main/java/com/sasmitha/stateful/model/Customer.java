package com.sasmitha.stateful.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private CustomerProfile profile;
    private CustomerContactInfo contactInfo;
    private CustomerAddress address;
}
