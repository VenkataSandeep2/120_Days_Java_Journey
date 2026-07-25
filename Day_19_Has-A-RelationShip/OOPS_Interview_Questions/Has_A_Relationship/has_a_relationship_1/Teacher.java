package com.has_a_relationship_1;

class Teacher
{
    private int teacherId;
    private String teacherName;

    // Default Constructor
    public Teacher()
    {
        System.out.println("Teacher Default Constructor");
    }

    // Parameterized Constructor
    public Teacher(int teacherId, String teacherName)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    // Getter
    public int getTeacherId()
    {
        return teacherId;
    }

    // Setter
    public void setTeacherId(int teacherId)
    {
        this.teacherId = teacherId;
    }

    // Getter
    public String getTeacherName()
    {
        return teacherName;
    }

    // Setter
    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    // toString()
    @Override
    public String toString()
    {
        return "Teacher [teacherId=" + teacherId
                + ", teacherName=" + teacherName + "]";
    }
}