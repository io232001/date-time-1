package it.develhope.datetime;

import java.time.LocalDate;

public class Start
{
    public static void main(String args[])
    {
        LocalDate today=LocalDate.now();
        System.out.println("days are left till the end of the month "+(31-today.getDayOfMonth()));
        System.out.println("days are left till the end of the years "+(365-today.getDayOfYear()));
    }
}

