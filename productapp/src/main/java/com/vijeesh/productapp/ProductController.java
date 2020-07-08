package com.vijeesh.productapp;

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


    @GetMapping("/product")
    public ProductInfo getProductInfo (){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Review> entity = new HttpEntity<Review>(headers);
        Review review = restTemplate.exchange("http://REVIEW-SERVICE/review",
                HttpMethod.GET, entity, Review.class).getBody();
        return new ProductInfo(111, "test prodtct", 2222, review );

    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
