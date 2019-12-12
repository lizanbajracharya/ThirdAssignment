package com.example.thirdassignment.Fragment;

public class Student {
    private Integer Imageid;
    private String Name;
    private String Address;
    private String Age;
    private String Gender;

    public Student(Integer imageid, String name, String address, String age, String gender) {
        Imageid = imageid;
        Name = name;
        Address = address;
        Age = age;
        Gender = gender;
    }

    public Integer getImageid() {
        return Imageid;
    }

    public void setImageid(Integer imageid) {
        Imageid = imageid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
