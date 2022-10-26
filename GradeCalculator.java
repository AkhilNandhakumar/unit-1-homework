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
            // i don't know :(
            input.close();
        }

    }
}
   