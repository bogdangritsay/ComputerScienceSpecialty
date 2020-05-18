package com.mcsumdu.hritsay.specialty.models;

public class EducationService {
    private int serviceId;
    private String title;
    private String description;
    private int subjectId;
    private int serviceUrlId;

    public EducationService() {}

    public EducationService(int serviceId, String title, String description, int subjectId, int serviceUrlId) {
        this.serviceId = serviceId;
        this.title = title;
        this.description = description;
        this.subjectId = subjectId;
        this.serviceUrlId = serviceUrlId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getServiceUrlId() {
        return serviceUrlId;
    }

    public void setServiceUrlId(int serviceUrlId) {
        this.serviceUrlId = serviceUrlId;
    }



    @Override
    public String toString() {
        return "EducationService{" +
                "serviceId=" + serviceId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subjectId=" + subjectId +
                ", serviceUrlId=" + serviceUrlId +
                '}';
    }
}
