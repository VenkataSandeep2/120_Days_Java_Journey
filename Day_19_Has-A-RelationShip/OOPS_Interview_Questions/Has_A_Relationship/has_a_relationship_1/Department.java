package com.has_a_relationship_1;


class Department
{
    private int departmentId;
    private String departmentName;

    // HAS-A Relationship
    private Teacher teacher;

    // Default Constructor
    public Department()
    {
        System.out.println("Department Default Constructor");
    }

    // Parameterized Constructor
    public Department(int departmentId,
                      String departmentName,
                      Teacher teacher)
    {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.teacher = teacher;
    }

    // Getters and Setters

    public int getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    // toString()
    @Override
    public String toString()
    {
        return "Department [departmentId=" + departmentId
                + ", departmentName=" + departmentName
                + ", teacher=" + teacher + "]";
    }
}


