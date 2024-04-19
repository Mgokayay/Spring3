package com.workintech.spring3.validations;

import com.workintech.spring3.entity.Kangaroo;
import com.workintech.spring3.exceptions.ZooException;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class ZooValidation {

    public static void isIdValid(Integer id){
        if(id == null || id<0){
            throw new ZooException("id cannot be null or less than zero: " + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkKangarooExistence(Map<Integer, Kangaroo> kangaroos, Integer id, boolean shouldBeExist) {
        if(shouldBeExist){
            if(!kangaroos.containsKey(id)){
                throw new ZooException("Id is not exist: "+ id,HttpStatus.NOT_FOUND);
            }
        }
        else{
            if(kangaroos.containsKey(id)){
                throw new ZooException("Id already exist: "+id,HttpStatus.BAD_REQUEST);
            }
        }
    }
}
