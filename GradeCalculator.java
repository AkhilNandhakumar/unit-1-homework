import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The final is in a separate category. Please input true or false.");
        boolean category = sc.nextBoolean();
        System.out.println("What is your current grade?");
        double currentGrade = sc.nextDouble();
        System.out.println("What is your desired grade after the final?");
        double desiredGrade = sc.nextDouble();

        if(category){
            System.out.println("What percent of your grade is the final?");
            int finalPercentage = sc.nextInt();
            double finalGrade = (desiredGrade - (currentGrade * ((100-finalPercentage)/100))/(finalPercentage-100));
            System.out.println("You need a " + finalGrade + "% on the final.");
            sc.close();
        }
        else{
            System.out.println("What percent of your grade is the test category?");
            int testPercentage = sc.nextInt();
            System.out.println("What is the current percentage you have in the test category?");
            int currentTestPercentage = sc.nextInt();
            System.out.println("How many points are currently in the test category?");
            int currentTestPoints = sc.nextInt();
            System.out.println("How many points are the final worth?");
            int finalPoints = sc.nextInt();
            double unchanged = currentGrade - currentTestPercentage;
            double newTestPercentage = desiredGrade - unchanged;
            double neededTotalPoints = (newTestPercentage/testPercentage) * (finalPoints + currentTestPoints);
            double currentEarnedPoints = (currentTestPercentage/testPercentage) * currentTestPoints;
            double neededFinalPoints = neededTotalPoints - currentEarnedPoints;
            System.out.println("You need " + neededFinalPoints + "points on the final.");
        }
    }
}
