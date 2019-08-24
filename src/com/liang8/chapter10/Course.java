package com.liang8.chapter10;

public class Course
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String cournseName)
    {
        this.courseName = courseName;
    }
    
    public void addStudent(String student)
    {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents()
    {
        return students;
    }
    
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public void dropStudent(String student)
    {
        // To be completed as exercise 10.9
    }
}
