package edu.gcccd.csis;

public class Company
{

    // declared variables
    private String name;
    private int numberOfEmployees;

    // default constructor
    public Company()
    {
    }

    // constructor with two parameters
    public Company(String name, int numberOfEmployees)
    {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    // getter
    public String getName()
    {
        return name;
    }

    // getter
    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    // setter
    public void setName(String name)
    {
        this.name = name;
    }

    // setter
    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    // Equals statement created by IntelliJ. Roger figured this out.
    // It checks that the object's name and number of employees are equal
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (numberOfEmployees != company.numberOfEmployees) return false;
        return name.equals(company.name);
    }

}