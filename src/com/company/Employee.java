package com.company;

public class Employee {

    private String surname;
    private String name;
    private int age;
    private String floor;
    private String education;
    private String position;
    private String department;

    public Employee(String surname,String name,int age,String floor,String education,String position,String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.floor = floor;
        this.education = education;
        this.position = position;
        this.department = department;
    }

    public Employee() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Фамилия='" + surname + '\'' + ", имя='" + name + '\'' + ", возраст=" + age + ", пол='" + floor + '\'' + ", образование='" + education + '\'' + ", должность='" + position + '\'' + ", отдел='" + department + '\'';
    }
}

