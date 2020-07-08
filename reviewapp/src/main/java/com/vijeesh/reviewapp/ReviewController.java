package com.vijeesh.reviewapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {


    @GetMapping("/review")
    public Review getReview(){
        return new Review("this is my test review", 4, 4, 6);

    }

}
