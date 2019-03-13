package com.bjsxt.controller;

import com.bjsxt.entity.People;
import com.bjsxt.service.PeopleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-03-11 16:18
 */

@RestController
@RequestMapping("/people")
public class PeopleController {

    private Logger logger = Logger.getLogger(PeopleController.class);

    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/byId")
    public People selectById() {
        System.out.println("hello ...");
        int id = 0;
        People people = peopleService.selectById(0);
        logger.error("test info ...");
        System.out.println(people);
        return people;
    }

}
