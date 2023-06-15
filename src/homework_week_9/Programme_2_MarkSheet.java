package homework_week_9;

import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
/*
Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
 */

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");// input wizard
        String name = scanner.next();
        System.out.println("Enter Student Roll Number:");// input wizard
        int rollNum = scanner.nextInt();
        System.out.println("Enter marks of subject Maths:");// input wizard
        int mathMarks = scanner.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.print("Invalid Input, Mark should between 0 to 100");
            System.out.print("Please enter correct marks of Maths");
            mathMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of subject Science:");// input wizard
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("Invalid Input, Mark should between 0 to 100");
            System.out.print("Please enter correct marks of Science");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of subject English:");// input wizard
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("Invalid Input, Mark should between 0 to 100");
            System.out.print("Please enter correct marks of English");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        // closing the scanner object
        scanner.close();
    }

    // calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // calculating the results on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }
        // calculating the grade on percentage & result
        public static String calculateGrade (int percentage, String result){
            String grade = null;
            if (result.equalsIgnoreCase("pass")) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
            return grade;
        }
        // printing the mark sheet
        public static void printTheMarkSheet(String name,int rollNum, int mathMarks, int scienceMarks,
        int englishMarks, double total, double percentage, String result, String grade){
            System.out.println("|----------------------------------------|");
            System.out.println("|             MARK SHEET                 |");
            System.out.println("|----------------------------------------|");
            System.out.println("| Name          : " + name + "           |");
            System.out.println("| Roll No       : " + rollNum + "        |");
            System.out.println("|----------------------------------------|");
            System.out.println("| Subjects      :   Marks                |");
            System.out.println("|----------------------------------------|");
            System.out.println("| Math          : " + mathMarks + "     |");
            System.out.println("| Science       : " + scienceMarks + "   |");
            System.out.println("| English       : " + englishMarks + "   |");
            System.out.println("|----------------------------------------|");
            System.out.println("| Total         : " + total + "          |");
            System.out.println("|----------------------------------------|");
            System.out.println("| Percentage    : " + percentage + "     |");
            System.out.println("| Result    : " + result + "             |");
            System.out.println("| Grade    : " + grade + "               |");
            System.out.println("|----------------------------------------|");
        }
    }
