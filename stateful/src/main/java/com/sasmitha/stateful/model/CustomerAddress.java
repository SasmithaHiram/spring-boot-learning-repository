package com.sasmitha.stateful.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerAddress {
    private String line1;
    private String line2;
    private String postalCode;
}
