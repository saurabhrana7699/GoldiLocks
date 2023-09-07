package com.goldilocks.Bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Test")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int empId;

    String empName;

    int empAge;
}
