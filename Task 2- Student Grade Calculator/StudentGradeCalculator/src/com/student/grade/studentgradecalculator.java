
package com.student.grade;

import java.util.Scanner;

public class studentgradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\t\t Student Grade Calculator\t\t\t\t\t");
            System.out.println();
            System.out.println();
	        System.out.print("Total Subjects: ");
	        int totalsubjects = sc.nextInt();
	        double totalmarks = 0;
	        for (int k = 1; k <= totalsubjects; k++) {
	            System.out.print("Marks of subject " + k + ": ");
	            int marks = sc.nextInt();
	            totalmarks += marks;
	        }

	        double calculateavgpercentage =  totalmarks / (totalsubjects * 100) * 100;
              char grade;
	        if (calculateavgpercentage >= 90) {
	            grade = 'A';
	        } else if (calculateavgpercentage >= 80) {
	            grade = 'B';
	        } else if (calculateavgpercentage >= 70) {
	            grade = 'C';
	        } else if (calculateavgpercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("--------------------------------");
	        System.out.println("Total Marks: " + totalmarks);
	        System.out.println("Average Percentage: " + calculateavgpercentage + "%");
	        System.out.println("Grade: " + grade);

	}

}
