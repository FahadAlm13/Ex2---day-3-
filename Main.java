import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1) .Write a program that checks the role of the user
        //If the role is admin print "welcome admin"
        //If the role is superuser print "welcome superuser"
        //If the role is user print "welcome user" (tip:
        //use if else)

//        System.out.println("Please Enter 1 if you are admin");
//        System.out.println("Please Enter 2 if you are superuser ");
//        System.out.println("Please Enter 3 if you are user");
//        int num = sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("welcome admin");
//                break;
//            case 2:
//                System.out.println("welcome superuser");
//                break;
//            case 3:
//                System.out.println("welcome user");
//                break;
//            default:
//                System.out.println("Please chose a number");
//        }

        //Q2)Take three numbers from the user and print the greatest number.
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //Expected Output : The
        //greatest: 87

//        System.out.println("Enter your first number");
//        int num = sc.nextInt();
//        System.out.println("Enter your second number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter your there number");
//        int num3 = sc.nextInt();
//
//        if ((num > num2) && num > num3) {
//            System.out.println("the greatest number is :" + num);
//        } else if (num2 > num && num2 > num3)
//            System.out.println("the greatest number is :" + num2);
//        else System.out.println("the greatest number is :" + num3);

        //Q3) .Write a Java program that generates an integer between 1 and 7 and
        //displays the name of the weekday.
        //Test Data
        //number: 4
        //Expected Output:
        //Wednesday

//        System.out.println("Please chose number between 1 - 7 : ");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Please chose from 1 to 7 : ");
//
//        }

        //Q4) Write a program that takes a numeric score as input and prints the
        //corresponding letter grade using the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        //Enter your numeric score: 85
        //Numeric Score: 85
        //Letter Grade: B

//        System.out.println("Please write your mark of 100 : ");
//        int num = sc.nextInt();
//        if (num > 100) {
//            System.out.println("Please chose from 0 - 100");
//        } else if (num >= 95) {
//            System.out.println("your grade is : A+");
//        } else if (num >= 90) {
//            System.out.println("your grade is :A");
//        } else if (num >= 85) {
//            System.out.println("your grade is :B+");
//        } else if (num >= 80) {
//            System.out.println("your grade is :B");
//        } else if (num >= 75) {
//            System.out.println("your grade is :C+");
//        } else if (num >= 70) {
//            System.out.println("your grade is :C");
//        } else if (num >= 65) {
//            System.out.println("your grade is :D+");
//        } else if (num >= 60) {
//            System.out.println("your grade is :D");
//        } else System.out.println("your grade is :F");
//    }

        //Q5 Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.
        //use an if statement to categorize the age based on the following criteria:
        //• If the age is less than 13, categorize them as a "Child."
        //• If the age is between 13 and 19 (inclusive), categorize them as a
        //"Teenager."
        //• If the age is 20 or older, categorize them as an "Adult."
        //Sample Output:
        //Enter your age: 25
        //You are an Adult.

//        System.out.println("Enter you age : ");
//        int age = sc.nextInt();
//        if (age < 13) {
//            System.out.println("You are a Child");
//        } else if (age <= 19) {
//            System.out.println("You are a Teenager");
//        } else System.out.println("You are an Adult");

    }
}
