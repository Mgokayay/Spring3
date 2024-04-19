package com.workintech.spring3.entity;

import com.workintech.spring3.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Koala {

    private Integer id;

    private String name;

    private Double weight;

    private Double sleepHour;

    private Gender gender;
}
