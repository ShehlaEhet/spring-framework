package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class Java {
    //field injection
    //@Autowired
    //OfficeHours officeHours;

    //Constructor injection


    // @Autowired
    OfficeHours officeHours;

    public void getTeachingHours() {
        //  this.officeHours = officeHours;


        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }

}
