package com.bjsxt.service;

import com.bjsxt.entity.People;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-03-11 16:14
 */
public interface PeopleService {

    People selectById(int id);

    void insertPeople();

}
