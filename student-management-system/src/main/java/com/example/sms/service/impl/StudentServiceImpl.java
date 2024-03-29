package com.example.sms.service.impl;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    public static StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {return studentRepository.findAll();}

    @Override
    public Student updateStudent(Student student) {return studentRepository.save(student);}

    @Override
    public Student getStudentById(Long id) {return studentRepository.findById(id).get();}

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
