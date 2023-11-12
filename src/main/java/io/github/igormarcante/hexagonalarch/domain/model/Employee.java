package io.github.igormarcante.hexagonalarch.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private String id;
    private String name;
    private String documentNumber;
    private Double salary;
    private String createdAt;
}
