package springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdemo.entity.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    public List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Berk", "Abbasoglu"));
        students.add(new Student("Sinan", "Kilickaya"));
        students.add(new Student("Kaan", "Celik"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    // define endpoint to get a single student by id
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        Student student = students.get(studentId);
        return student;
    }


}
