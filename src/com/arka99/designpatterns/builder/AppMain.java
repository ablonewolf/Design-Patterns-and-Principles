package com.arka99.designpatterns.builder;

public class AppMain {
    public static void main(String[] args) {
        Employee arka = new Employee.Builder("Arka Bhuiyan","arkabhuiyan@bjitgroup.com").setAddress("Mirpur, Dhaka").setAge(24).setPost("Software Engineer").setUniversity("University of Dhaka").build();
        System.out.println(arka);
    }
}
