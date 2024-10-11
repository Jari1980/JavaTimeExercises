package org.example;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-11 :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
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