package com.tts;

public class Student extends Person{

    private Integer gradYear;
    private Boolean enrolled = false;

    public void enrolledStudent() {

        enrolled = true;
    }

    public Student(String name, Integer age, String location, Integer gradYear, Boolean enrolled) {
        super(name, age, location);
        this.gradYear = gradYear;
        this.enrolled = enrolled;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    public Boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        this.enrolled = enrolled;
    }
}
