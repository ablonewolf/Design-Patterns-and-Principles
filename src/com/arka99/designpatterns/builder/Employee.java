package com.arka99.designpatterns.builder;

public class Employee {
    private String name;
    private String email;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", address='" + address + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    private String post;
    private String address;
    private String university;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
        this.post = builder.post;
        this.university = builder.university;
    }

    public static class Builder {
        private final String name;
        private final String email;
        private int age;
        private String post;
        private String address;
        private String university;


        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPost(String post) {
            this.post = post;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }
}
