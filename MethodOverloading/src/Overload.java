public class Overload {

    public static void main(String[] args) {

        System.out.println("Height:" + convertToCentimetres(75));
        System.out.println("Height:" + convertToCentimetres(5,5));
    }

    public static double convertToCentimetres(int height) {

        return height * 2.54;
    }

    public static double convertToCentimetres(int feet, int inches) {

        int heightInInches = (feet * 12) + inches;
        return convertToCentimetres(heightInInches);
    }
}
