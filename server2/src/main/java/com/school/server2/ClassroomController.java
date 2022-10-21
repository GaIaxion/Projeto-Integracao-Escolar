package com.aula118.server2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomController {
    //end point
    private static Classroom student = new Classroom(1,1);
@GetMapping("/class")
    public ClassroomResponse getStudent(){
        
        return ClassroomResponse.builder().id(student.getId()).number(student.getNumber()).build();
    }
}
