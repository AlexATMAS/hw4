package com.hw4;

public class Main
{

    public static void main(String[] args)
    {
////Задание1;

    System.out.print("Задание 1\n\n");
        int i = 0;
            while (i !=10)
            {
                i++;
                System.out.print(i + " ");
            }
        //System.out.print(i);
        System.out.print("\n");
            for (;i>=1;i--)
            {
                System.out.print(i + " ");
            }
    System.out.print("\n\nЗадание 2\n\n");

////Задание2;
                                // декабрь 2021 г.
        int numDay; // день;
        int fridayNumDay = 10; // Число первой пятницы любого месяца ;

            for (numDay = 1; numDay <= 31; numDay++)
            {
                if (fridayNumDay - numDay == 0)
                {
                    System.out.println("Сегодня пятница," + numDay + "-е число. Необходимо подготовить отчет.");
                    fridayNumDay += 7;

                }

            }
    System.out.print("\nЗадание 3\n\n");


////Задание3;
        int age;
        int rangeAgeA = 2022 - 200;
        int rangeAgeB = 2022 + 100;
        int cometAge;
            for (age=0;age < rangeAgeB;age+=79)
            {
                cometAge=age;
                    if (age>=rangeAgeA && age<=rangeAgeB)
                    {
                        System.out.print(age + "\n");
                    }
            }




    }
}
