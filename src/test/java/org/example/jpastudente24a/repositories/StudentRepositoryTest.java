package org.example.jpastudente24a.repositories;

import org.example.jpastudente24a.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneStudent() {
        List<Student> list = studentRepository.findAll();
        assertEquals(1, list.size());
    }

}