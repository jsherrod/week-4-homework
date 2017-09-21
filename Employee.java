package edu.gcccd.csis;

import java.util.*;

public class Employee
{
    // declared variables
    private String name;
    private String jobTitle;
    private Company company;
    private Calendar birthday;

    // default constructor
    public Employee()
    {
    }

    // constructor with four parameters
    public Employee(String name, String jobTitle, Company company, Calendar birthday)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.birthday = birthday;
    }

    // getter
    public String getName()
    {
        return name;
    }

    // getter
    public String getJobTitle()
    {
        return jobTitle;
    }

    // getter
    public Company getCompany()
    {
        return company;
    }

    // getter
    public Calendar getBirthday()
    {
        return birthday;
    }

    // setter
    public void setName(String name)
    {
        this.name = name;
    }

    // setter
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    // setter
    public void setCompany(Company company)
    {
        this.company = company;
    }

    // setter
    public void setBirthday(Calendar birthday)
    {
        this.birthday = birthday;
    }

    // Equals statement created by IntelliJ. Roger figured this out.
    // It checks that the object's name, company and birthday are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        if (!company.equals(employee.company)) return false;
        return birthday.equals(employee.birthday);
    }

}