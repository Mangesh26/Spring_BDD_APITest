package com.example.demo;

public class HelloWorldBean {

	String name;
    
    public void printHello()
    {
        System.out.println("Hello World from "+name);
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

}
