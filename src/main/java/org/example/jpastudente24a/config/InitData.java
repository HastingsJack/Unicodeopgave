package org.example.jpastudente24a.config;

import org.example.jpastudente24a.model.Student;
import org.example.jpastudente24a.model.Unicode;
import org.example.jpastudente24a.repositories.StudentRepository;
import org.example.jpastudente24a.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

//        Set<Character> letters = new HashSet<>();
//        for(int i = 33; i < 128; i++) {
//            letters.add((char)i);
//        }
//
//        for(char letter : letters) {
//            Unicode code = new Unicode();
//            if(letter == '?') {
//                code.setDescription("FAVORITE");
//            }
//            if(letter == 'b') {
//                code.setDescription("eewwww");
//            }
//            code.setUnicode(letter);
//            code.setLetter(letter);
//            unicodeRepository.save(code);
//        }

        Student student = new Student();
        student.setName("John");
        student.setBornDate(LocalDate.of(2010,11,12));
        student.setBornTime(LocalTime.of(10,11,12));
        Student student2 = new Student();
        student2.setName("Jane");
        student2.setBornDate(LocalDate.of(2010,11,12));
        student2.setBornTime(LocalTime.of(10,11,12));

        studentRepository.save(student);
        studentRepository.save(student2);

    }
}
