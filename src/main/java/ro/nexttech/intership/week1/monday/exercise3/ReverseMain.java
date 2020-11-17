package ro.nexttech.intership.week1.monday.exercise3;

public class ReverseMain {
    public static void main(String[] args) {
        String[] content = new String[]{"10","2","3","+","*"};
        ReverseCalculatorService reverseCalculatorService = new ReverseCalculatorService();
        System.out.println(reverseCalculatorService.reverseCalculator(content));
    }
}
