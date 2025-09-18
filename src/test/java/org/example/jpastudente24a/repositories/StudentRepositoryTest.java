package org.example.jpastudente24a.repositories;

import org.example.jpastudente24a.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student student = new Student();
        student.setName("test");
        studentRepository.save(student);
    }
    @Test
    void testOneStudent() {
        List<Student> list = studentRepository.findAll();
        assertEquals(1, list.size());
    }

}