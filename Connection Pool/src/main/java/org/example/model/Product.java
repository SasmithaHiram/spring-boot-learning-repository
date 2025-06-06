package org.example.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
}
