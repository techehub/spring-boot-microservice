package com.vijeesh.productapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ProductController {


    @Autowired
    RestTemplate restTemplate;

/*
    @HystrixCommand(fallbackMethod = "getDefaultInfo",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
            })
  */
    @GetMapping("/product")

    public ProductInfo getProductInfo (){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Review> entity = new HttpEntity<Review>(headers);
        Review review = restTemplate.exchange("http://REVIEW-SERVICE/review",
                HttpMethod.GET, entity, Review.class).getBody();
        return new ProductInfo(111, "test prodtct", 2222, review );

    }

    public ProductInfo getDefaultInfo(){
        return new ProductInfo(111, "test prodtct", 2222, new Review("", 0, 0, 0)  );

    }


    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
