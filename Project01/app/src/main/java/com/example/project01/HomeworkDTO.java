package com.example.project01;

import java.io.Serializable;

public class HomeworkDTO implements Serializable {
    private String name, homework, submit;
    private int avg, max;

    public HomeworkDTO(String name, String homework, String submit, int avg, int max) {
        this.name = name;
        this.homework = homework;
        this.submit = submit;
        this.avg = avg;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

