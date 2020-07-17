package com.vijeesh.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    @Value("${app.title: default}")
    String apptitle;


    @GetMapping("/test")
    public  String test(){
        return  this.apptitle;
    }


}
