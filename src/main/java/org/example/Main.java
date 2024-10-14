package org.example;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-16 :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
                        break;
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
                        break;
                    case 8:
                        exercise8();
                        break;
                    case 9:
                        exercise9();
                        break;
                    default:
                        System.out.println("There is no such exercise");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Closing program");
                System.exit(0);
            }
        }
    }
    public static void exercise9(){
        LocalTime time = LocalTime.now();
        System.out.println("Localtime now: " + time);
    }

    public static void exercise8(){
        var period = Period.of(4, 7, 29);
        var date = LocalDate.now();
        var dateU = date.plus(period);
        System.out.println("Time now: " + date + ", adding 4y, 7m and 29d: " + dateU);
    }

    public static void exercise7(){
        LocalDate date1 = LocalDate.now().plusYears(10).minusMonths(10);
        LocalDate date2 = LocalDate.of(1980,8,31);
        var period = Period.between(date2, date1);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Elapsed time between " + date2 + " and " + date1 + " is: " + years +
                "years " + months + "months and " + days + "days");
    }

    public static void exercise6(){
        LocalDate date = LocalDate.now().plusYears(10).minusMonths(10);
        var month = date.getMonth();
        System.out.println("Extracting month from " + date + " : " + month);
    }

    public static void exercise5(){
        LocalDate date = LocalDate.of(1980,8,31);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of the date " + date + " was: " + day);
    }

    public static void exercise4(){
        LocalDate date = LocalDate.parse("2024-10-12");
        System.out.println("Creating a LocalDate object using parse method: " + date);
    }

    public static void exercise3(){
        LocalDate lastM = LocalDate.of(2024, 10, 7);
        System.out.println("LocalDate of last monday: " + lastM);
        System.out.println("This entire week using basic ISO format: ");
        for (int i = 0; i < 7; i++){
            System.out.println(lastM.plusDays(i).format(DateTimeFormatter.BASIC_ISO_DATE));
        }
    }

    public static void exercise2(){
        Locale locale = Locale.forLanguageTag("sv");
        LocalDate date = LocalDate.now();
        String dateCustom = date.format(DateTimeFormatter.ofPattern("eeee dd MMM").withLocale(locale));
        System.out.println("Printing todays date customized and translated to swedish: " + dateCustom);
    }

    public static void exercise1(){
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate of of current day: " + date);
    }
}