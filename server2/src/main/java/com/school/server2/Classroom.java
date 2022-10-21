package com.aula118.server2;

//import lombok.Builder;
//import lombok.Data;

public class Classroom {
    
    
    private Integer id;
    private Integer number;
    public Classroom(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    
   
    
}