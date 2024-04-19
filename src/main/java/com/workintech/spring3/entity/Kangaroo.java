package com.workintech.spring3.entity;

import com.workintech.spring3.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Kangaroo {

    private Integer id;

    private String name;

    private Double height;

    private Double weight;

    private Gender gender;

    private Boolean isAggressive;
}
