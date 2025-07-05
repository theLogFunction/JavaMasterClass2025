public class FirstClass {

    public static void main(String[] args) {
        System.out.print("Hello Sushrut");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Sushrut is not an Alien");
            System.out.println("And I am scared of aliens!");
        }
        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 95;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than 2nd Top Score and Lesser than 1st Top Score!");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("Either of the above conditions are true");

        int newVal = 50;
        if(newVal == 50)
            System.out.println("This is an Error");

        boolean isCar = false;
        if(isCar)
            System.out.println("This should not happen");

        String makeOfCar = "Hyundai";
        boolean isDomestic = makeOfCar == "Tata" ? true : false;

        if(isDomestic)
            System.out.println("This car is domestic to our country");

        Double firstValue = 20.00;
        Double secondValue = 80.00;
        Double sum = (firstValue + secondValue) * 100;
        Double remainder = sum % 40;
        boolean isDivisible = remainder == 0 ? true : false;
        System.out.println("The isDivisible Value is : " + isDivisible);

        if(!isDivisible)
            System.out.println("Got some remainder");
    }
}
