package com.diagonastictest.diagonastic.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DiagnosticTests {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int test_id;
private String test_name;
private String lab_name;
private String Processing_time;
@DateTimeFormat(pattern = "yy-MM-dd")
private Date order_date;

}
