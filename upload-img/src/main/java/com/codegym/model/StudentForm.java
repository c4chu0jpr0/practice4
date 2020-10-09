package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class StudentForm {
    private int id;
    private String name, address;
    private MultipartFile image;

    public StudentForm() {
    }

    public StudentForm(int id, String name, String address, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public StudentForm(String name, String address, MultipartFile image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
