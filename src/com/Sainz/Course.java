package com.Sainz;

public class Course {
    private String courseName;
    private String courseNumber;
    private String roomNumber;

    @Override
    public String toString() {
        return "course name: " +courseName +'\n' + "course number: " + courseNumber + '\n' + "room number: " + roomNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
