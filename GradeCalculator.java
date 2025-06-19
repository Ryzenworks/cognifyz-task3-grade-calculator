package LevelOneTasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Subjects: ");
        int noOfSubjects = scanner.nextInt();
        double avg = 0;
        int[] marks = new int[noOfSubjects];
        for(int i = 0; i<marks.length; i++){
            System.out.print("Enter marks for Subject " + (i+1) + " :");
            marks[i] = scanner.nextInt();
            avg = avg + marks[i];
        }
        for(int i = 0; i<marks.length; i++){
            System.out.println("Subject " + (i+1) + " Marks: " +  marks[i] + " - " + getGrade(marks[i]));
        }
        avg = avg/noOfSubjects;
        System.out.println("Average Marks: " + String.format("%.2f", avg));
        scanner.close();
    }
    public static String getGrade(int marks){

        String grade = "";
        if(marks>=90 && marks<=100) grade = "Grade \"A\"";
        else if(marks>=80 && marks<=89) grade = "Grade \"B\"";
        else if(marks>=70 && marks<=79) grade = "Grade \"C\"";
        else if(marks>=60 && marks<=69) grade = "Grade \"D\"";
        else if(marks<60 && marks>=0) grade = "Grade \"F\"";
        else {
            throw new IllegalArgumentException("Invalid Marks");
        }
        return grade;
    }
}
