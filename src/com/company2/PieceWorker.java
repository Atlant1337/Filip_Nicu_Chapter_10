package com.company2;

public class PieceWorker extends Employee
{
    private double wage;
    private int pieces;

    public PieceWorker(String first, String last, String ssn,
                       Date bdate, double w, int p)
    {
        super(first, last, ssn, bdate);
        setWage(w);
        setPieces(p);
    }

    public void setWage(double w)
    {
        wage = w;
    }

    public void setPieces(int p)
    {
        pieces = p;
    }

    public double getWage()
    {
        return wage;
    }

    public int getPieces()
    {
        return pieces;
    }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString()
    {
        return String.format("Pieceworker: %s\n%s: $%,.2f\n%s: %d",
                super.toString(), "Wage", getWage(), "Pieces", getPieces());
    }

}