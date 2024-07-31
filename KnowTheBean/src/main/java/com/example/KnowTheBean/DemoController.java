package com.example.KnowTheBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach mycoach;
    //private Coach anothercoach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        mycoach = coach;
        //anothercoach = secondCoach;
    }

    @GetMapping("/coach")
    public String swimmer(){
        return mycoach.getDailyWorkOut();
    }
//    @GetMapping("/coach")
//    public String sayCoach(){
//        return mycoach.getDailyWorkOut() + " teri gand mein dalunge aur "+ anothercoach.getDailyWorkOut();
//    }
//
//    @GetMapping("/check")
//    public String checkEqual(){
//        return "The beans are same? = "+(mycoach == anothercoach);
//    }

    @GetMapping("/")
    public String sayHello(){
        return "the code is working....";
    }
}
