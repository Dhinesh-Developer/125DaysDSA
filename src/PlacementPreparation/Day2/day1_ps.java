package PlacementPreparation.Day2;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class day1_ps {

    //find the number is odd or even
    private static void program1(){
        int n = 8;
        if(n%2==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even!");
        }
    }

    // the number is postive or negative or zero
    private static void program2(){
        int n = -5;
        if(n > 0){
            System.out.println("Number is positive");
        }else if(n<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }

    //max of two number
    private static void program3(){
        int n1 = 10;
        int n2= 20;
        int max = n1>n2?n1:n2;
        System.out.println("Max is "+max);
    }

    private static void program4(){
        // divisible by 5 and 11
        int n = 55;
        if(n%5==0 && n%11==0){
            System.out.println("Number is divisible!");
        }else{
            System.out.println("Number is not divisible!");
        }

    }

    // voting eligiblity
    private static void program5(){
        int age = 19;
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }

    //Triangle Type Checker
    //Problem: Determine if a triangle is equilateral, isosceles, or scalene.
    private static void program6(){
        int n1 = 5,n2 = 5,n3 = 6;
        if(n1 == n2 && n1==n3 && n2==n3){
            System.out.println("Equilateral");
        }else if(n1==n2 || n2==n3 || n1==n3){
            System.out.println("Isoleces");
        }else{
            System.out.println("Scalene");
        }
    }

    //Problem: Check if a year is a leap year.
    private static void program7(){
        int year = 2024;
        if(year % 400 == 0 || (year %100 != 0 && year %4==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }

    //8. Character Type Check
    private static void program8(){
        char ch = 'A';
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                System.out.println("Uppercase");
            }else{
                System.out.println("LowerCAse");
            }
        }else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }else{
            System.out.println("Special character");
        }

    }

    // profit or loss
    private static void program9(){
        int CP = 500;
        int SP = 300;

        if(SP > CP){
            System.out.println("Profit: "+(SP-CP));
        }else{
            System.out.println("Loss: "+(CP-SP));
        }
    }

    // Grade calculation
    private static void program10(){
        int n = 100;
        if(n >= 90){
            System.out.println("Grade: A");
        }else if(n >= 75 && n <90){
            System.out.println("Grade B");
        }else if(n >= 50 && n<75){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }

//Problem: Find the nature of roots of a quadratic equation (real & distinct, real & equal, imaginary).
    private static void program11(){
        int a = 1;
        int b = -5;
        int c = 6;

        int discrimant = b*b - 4*a*c;
        if(discrimant == 0){
            System.out.println("Real and equal");
        }else if(discrimant > 0){
            System.out.println("Real and distinct");
        }else{
            System.out.println("imaginary");
        }
    }

    //Check if a given date (day, month, year) is valid, considering:valid leap year
    private static void program12(){
        int day = 29;
        int month = 2;
        int year = 2024;
        if(month == 2){
            if(day == 29){
                if(year %400 == 0 || (year % 4==0 && year%100 != 0)){
                    System.out.println("is leap year!");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Invalid date");
            }
        }else{
            System.out.println("Invalid month");
        }
    }

    //13. Electricity Bill Calculator
    private static void program13(){
        int unit = 350;

        int bill = 0;
        if(unit <= 100){
            bill = unit*5;
        }else if(unit <= 300){
            bill = 100*5;
            bill += (unit-100)*7;
        }else if(unit > 300){
            bill = 100 *5;
            bill += 200*7;
            bill += (unit - 300)*10;
        }
        System.out.println("Bill: "+bill);
    }


    // valid triangle
    private static void program14(){
        int a = 10;
        int b = 7;
        int c = 5;
        if(a+b > c || b+c > a || a+c > b){
            System.out.println("Valid traingle");
        }else{
            System.out.println("Invalid triangle!");
        }
    }

    private static void program15(){
        int a = 10;
        int b = 5;
        char operator = '+';
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void main(String[] args) {

        program1();
        program2();
        program3();
        program4();
        program5();

        // medium
        program6();
        program7();
        program8();
        program9();
        program10();

        // hard
        program11();
        program12();
        program13();
        program14();
        program15();
    }
}
