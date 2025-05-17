package edu.icet.ecom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Product {
    private String title;
    private Double price;
    private String description;
    private String category;
}
