package org.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JianHuangsh on 2017/10/24.
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/dac", method = RequestMethod.GET)
    public String dac() {
        System.err.println("load dac");
        String services = discoveryClient.getServices().toString();
        System.err.println(services);
        return services;
    }

    @RequestMapping(value = "/serviceA", method = RequestMethod.GET)
    public void doServiceA(){
       //restTemplate.getForObject();
    }


}
