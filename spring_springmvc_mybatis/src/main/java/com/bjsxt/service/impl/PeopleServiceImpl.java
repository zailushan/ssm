package com.bjsxt.service.impl;

import com.bjsxt.entity.People;
import com.bjsxt.mapper.PeopleMapper;
import com.bjsxt.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-03-11 16:14
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public People selectById(int id) {
        return peopleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertPeople() {
        People people = new People();
        people.setId(123);
        people.setAge(20);
        people.setName("haha1");
        peopleMapper.insertSelective(people);
    }
}
