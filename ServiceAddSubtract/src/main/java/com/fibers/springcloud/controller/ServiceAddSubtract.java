package com.fibers.springcloud.controller;

import com.fibers.springcloud.service.IServiceAddSubtract;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by fibers on 2017/6/23.
 */
@RestController
public class ServiceAddSubtract implements IServiceAddSubtract {

    public final static Logger log = Logger.getLogger(ServiceAddSubtract.class);

    @RequestMapping("/add")
    public Float add(@RequestParam Float a, @RequestParam Float b) {

        Float result = a + b;
        log.info("*********** result : " + result + "***********");

        return result;
    }

    @RequestMapping("/subtract")
    public Float subtract(@RequestParam Float a, @RequestParam Float b) {

        Float result = a - b;
        log.info("*********** result : " + result + "***********");
        return result;
    }
}
