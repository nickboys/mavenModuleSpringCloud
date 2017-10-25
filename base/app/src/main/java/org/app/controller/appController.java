package org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JianHuangsh on 2017/10/24.
 */
@RestController
public class appController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/doService", method = RequestMethod.GET)
    public void doService() {
        System.err.println("load dac");
       restTemplate.getForObject("http://dac/dac",String.class);
    }
}
