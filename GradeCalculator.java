import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is final in a separate category: (true/false)");
        boolean check = input.nextBoolean();

        if(check){
            System.out.println("Current Grade:");
            double currentGrade = input.nextDouble();

            System.out.println("Desired Grade:");
            double desiredGrade = input.nextDouble();

            System.out.println("How much percent of your grade is the final:");
            double finalPercent = input.nextDouble();
            double finalGrade = ((desiredGrade-((1-finalPercent/100)*currentGrade))/(finalPercent/100));
            System.out.println("You need: " + finalGrade + "%");
            input.close();
        }

        else{
            System.out.print("Current grade? ");
            double currentGrade = input.nextDouble();
            System.out.println(currentGrade);

            System.out.print("Test category weight: ");
            int testCat = input.nextInt();
            System.out.println(testCat);

            System.out.print("total points in test category: ");
            int testCatPoints = input.nextInt();
            System.out.println(testCatPoints);

            System.out.print("final points: ");
            int finalPoints = input.nextInt();
            System.out.println(finalPoints);

            System.out.print("your grade in test category: ");
            double testCatGrade = input.nextDouble();
            System.out.println(testCatGrade);

            System.out.print("desired grade: ");
            double desiredGrade = input.nextDouble();
            System.out.println(desiredGrade);

            double finalScore = ((0.01*testCatGrade*finalPoints*testCat)-(finalPoints*currentGrade)+(finalPoints*desiredGrade)-(currentGrade*testCatPoints)+(testCatPoints*desiredGrade))/testCat;
            System.out.print("You need to get at least a " + String.format("%.2f", (finalScore/finalPoints)*100) + "% on you final to get a " + desiredGrade);
        }

    }
}
   