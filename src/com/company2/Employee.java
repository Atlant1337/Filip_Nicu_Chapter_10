package com.company2;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee(String first, String last, String ssn, Date bdate)
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        birthDate = bdate;
    }

    public void setFirstName(String first)
    {
        firstName = first;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String last)
    {
        lastName = last;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn)
    {
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public void setBirthDate(Date bdate)
    {
        birthDate = bdate;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s\nSocial Security Number: %s\nBirthdate: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }

    public abstract double earnings();
}