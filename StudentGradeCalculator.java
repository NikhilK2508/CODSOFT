import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Student Grade Calculator");
            System.out.println("Enter the No. of Subjects:");
            int nextSub = sc.nextInt();
            int total= 0;
            for(int i =0; i<nextSub; i++){
                System.out.println("Enter marks that you have obtained in" +i+ " subject :");
                int marks =sc.nextInt();
                total+=marks;

            }
            double averP=(double)total/nextSub;
            char Grade;
            if(averP>90){
                Grade = '0';
            }
            else if(averP>80){
                Grade = 'A';
            }
            else if(averP>70){
                Grade = 'B';
            }
            else if(averP>60){
                Grade = 'C';
            }
            else if(averP>50){
                Grade = 'D';
            }
            else if(averP>40){
                Grade = 'E';
            }
            else{
                Grade = 'F';
            }
            System.out.println("Total marks Scored is:" + total);
            System.out.println("Avarage percentage  is: " + averP + "%");
            System.out.println("Grade is :" + Grade);
        }
        System.out.println("Thank you!");
    }
}
