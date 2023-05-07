package com.jpa.exam.bootjpaexam.dao;

import com.jpa.exam.bootjpaexam.entities.user;
import org.springframework.data.repository.CrudRepository;


public interface UserRes extends CrudRepository<user , Integer> {


}
