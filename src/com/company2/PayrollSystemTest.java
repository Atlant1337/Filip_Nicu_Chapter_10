package com.company2;

public class PayrollSystemTest
{
    public static void main(String[] args)
    {
        int currentMonth = 3;

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("Arthur", "Morgan", "63895", new Date(1,31,1990), 8000.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("John", "Marston", "88471", new Date(2,28,1990), 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Bill", "Williamson", "47223", new Date(3,31,1990), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Hosea", "Matthews", "94752", new Date(4,1,1990), 5000, .04, 300);
        PieceWorker pieceworker =
                new PieceWorker("Dutch", "van der Linde", "35056", new Date(7,2,1997), .60, 1500);

        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceworker;

        System.out.println("Employees processed polymorphically: \n");

        for ( Employee currentEmployee : employees)
        {
            System.out.println(currentEmployee);
            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        }

        for ( int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s\n", j,
                    employees[j].getClass().getName());
    }
}