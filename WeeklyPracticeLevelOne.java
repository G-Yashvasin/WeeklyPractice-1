public class WeeklyPracticeLevelOne {
    public static void main(String[] args) {

        int courseFee = 125000;
        double discountRate = 0.10;

        double discountAmount = courseFee * discountRate;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("The Course Fee is INR " + courseFee);
        System.out.println("The Discount Amount is INR " + discountAmount);
        System.out.println("The Discounted Price the student will pay is INR " + discountedPrice);
    }
}