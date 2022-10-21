package com.school.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentClientResponse {
    private Integer id;
    private String name;
    private Integer age;


}
