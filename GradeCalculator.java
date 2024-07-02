package task3;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double AveragePercentage;
        double Total = 0;
        char grade;
        System.out.print("Enter the number of subjects: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter marks :");
            int marks = scanner.nextInt();
            Total += marks;
        }

         AveragePercentage = ( Total /( num*100 )) * 100;
        if (AveragePercentage >= 90) 
            grade = 'A';
        else if (AveragePercentage >= 80) 
            grade = 'B';
        else if (AveragePercentage >= 70) 
            grade = 'C';
         else if (AveragePercentage >= 60) 
            grade = 'D';
        else 
            grade = 'F';
        

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + Total);
        System.out.println("Average Percentage: " + AveragePercentage + "%");
        System.out.println("Grade: " + grade);
	
        scanner.close();
}
}

