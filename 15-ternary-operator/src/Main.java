public class Main {

    public static void main(String[] args) {

        // variable = (condition) ? IfTrue : IfFalse;

        int score = 75;

        int number = 10;

        int hours = 13;

        int income = 60000;


        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        String timeOfDay = (hours < 12) ? "A.M." : "P.M";

        double taxRate = (income > 40000) ? 0.25 : 0.15;

        System.out.println("Score: " + score + " - " + passOrFail);
        System.out.println("Number: " + number + " - " + evenOrOdd);
        System.out.println("Hours: " + hours + " - " + timeOfDay);
        System.out.println("Income: $" + income + " - Tax Rate: " + (taxRate * 100) + "%");

    }

}