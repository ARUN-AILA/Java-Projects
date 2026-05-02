package com.codegnan.projects;

import java.util.Scanner;

public class StudentGrading {


		public static char calculateGrade(double percentage) {
			if(percentage>=90) {
				return 'A';
			}
			else if(percentage>=80) {
				return 'B';
			}
			else if(percentage>=70) {
				return 'C';
			}
			else if(percentage>=60) {
				return 'D';
			}
			else {
				return 'F';
			}
			
		}
		
		public static int findTopper(double[] percentages) {
			int topperIndex = 0;
			for(int i=1;i<percentages.length;i++) {
				if(percentages[i]>percentages[topperIndex]) {
					topperIndex = i;
				}
			}
			return topperIndex;
		}
		
		public static double calculateClassAverage(double[] percentages) {
			double sum = 0;
			for(double p : percentages) {
				sum = sum+p;
			}
			return sum/percentages.length;
			
		}	
		
		public static void displayResults(String[] names,int[] totals,double[] percentages,char[] grades, int topperIndex,double classAverage ) {
			
			System.out.println("====CLASS PERFORMANCE REPORT====");
			for(int i =0;i<names.length;i++) {
				System.out.println("Name         :"+names[i]);
				System.out.println("Percentage   :"+percentages[i]);
				System.out.println("Grade        :"+grades[i]);
				if(i==topperIndex) {
					System.out.println("Status   :   Topper");
				}
				System.out.println("class Average Percentage :"+classAverage);
				System.out.println("Topper :"+names[topperIndex]);
			}
			
			public static void main(String[]args) {
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter number of students :");
				int n = scan.nextInt();
				scan.nextLine();
				
				String[] names = new String[n];
				int[] totals = new int [n];
				double [] percentages = new double[n];
				char [] grades = new char[n];
				
				for(int i=0;i<n;i++) {
					System.out.println("\nEnter details for student "+(i+1));
					System.out.println("Enter name:");
					names[i]=scan.nextLine();
					
					System.out.println("Enter marks for subject1 :");
					int m1 = scan.nextInt();
					
					System.out.println("Enter marks for subject2 :");
					int m2 = scan.nextInt();
					
					System.out.println("Enter marks for subject3 :");
					int m3 = scan.nextInt();
					scan.nextLine();
					
					totals[i]=m1+m2+m3;
					percentages[i] = totals[i]/3.0;
					
				grades[i]= calculateGrade(percentages[i]);
					
				}
				
				int topperIndex = findTopper(percentages);
				double classAverage = calculateClassAverage(percentages);
				
				displayResults(names,totals,percentages,grades,topperIndex,classAverage);
				scan.close();
				
			
		
		
		
	}
}
