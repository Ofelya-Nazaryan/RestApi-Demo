package com.example.restapidemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

      @Autowired
    public StudentController(StudentService studentService){
       this.studentService=studentService;
           }


    @GetMapping
    public List<Student> getStudents(){
       return studentService.getStudents();
    }

    @PostMapping
    public void regiserNewStudent(@RequestBody Student student){
          studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentID) {
        studentService.deleteStudent(studentID);
    }


    @PutMapping
     public void updateStudent(
        @PathVariable("studentId") Long studentID,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email){
     studentService.updateStudent(studentID,name,email);
    }


}
