package com.cbu.CBU_TEST.trafficLight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trafficLight")
public class TrafficLightController {
	
	@RequestMapping("/index")
    public String index() {
        return "Hello World ";
    }
}
