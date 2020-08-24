public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        int firstNumber = (int) (a * 1000);
        int secondNumber = (int) (b * 1000);

        return firstNumber == secondNumber;

    }

}
