/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int a;
        int y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Put your birth month");  //prompt the user for a birth month
        a = keys.nextInt();
        System.out.println("Put your birth year");
        y = keys.nextInt();
        keys.close();
        //determine the number of days in the user's birth month
       if (y%4==0 && a==2){
       System.out.println ("your birth month is February and has 29 days because it is a leap year");
    }
       else if (y%4 != 0){
       System.out.println ("your birth year is" + y  );}
        if (a==1) {
           System.out.println ("your birth month is January and has 31 days");}
            else if (a==2) {
                System.out.println ("your birth month is February and has 28 days");}
                else if (a==3) {
                    System.out.println ("your birth month is March and has 31 days");}
                    else if (a==4) {
                    System.out.println ("your birth month is April and has 30 days");}
                    else if (a==5) {
                        System.out.println ("your birth month is May and has 31");}
                        else if (a==6) {
                            System.out.println ("your birth month is June and has 30 days");}
                            else if (a==7) {
                                System.out.println ("your birth month is July and has 31 days");}
                                else if (a==8) {
                                    System.out.println ("your birth month is August and has 31 days");}
                                    else if (a==9) {
                                        System.out.println ("your birth month is September and has 30 days");}
                                        else if (a==10) {
                                            System.out.println ("your birth month is October and has 31 days");}
                                            else if (a==11) {
                                                System.out.println ("your birth month is November and has 30 days");}
                                                else if (a==12) {
                                                    System.out.println ("your birth month is December and has 31 days");}
                                                    else if (a >12) {
                                                        System.out.println ("you're wrong, there are no months past December");}
                                                        else if (a<0) {
                                                            System.out.println ("you're wrong, there are no negative months");}
        }
        //output the result to the user
       
    }
