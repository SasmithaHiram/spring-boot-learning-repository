package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {
    private Integer id;
    private String name;
    private String email;
    private Integer phoneNumber;
    private String password;
    private String confirmPassword;

}
