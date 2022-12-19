package com.example.sms.service;

import com.example.sms.entity.Class;

import java.util.List;

public interface ClassService {

    List<Class> getAllClasses();

    Class saveClass(Class class);

    Class updateClass(Class class);

    Class getClassById(Long id);

    void deleteClassById(Long id);

}
