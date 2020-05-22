package com.mcsumdu.hritsay.specialty.models;

public class Educator {
    private int educatorId;
    private String name;
    private String surname;
    private String patronymic;
    private String description;
    private String urlToImage;
    private int managerId;
    private int roleId;

    public Educator() {}

    public Educator(int educatorId, String name, String surname, String patronymic, String description, String urlToImage, int managerId, int roleId) {
        this.educatorId = educatorId;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.description = description;
        this.urlToImage = urlToImage;
        this.managerId = managerId;
        this.roleId = roleId;
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
