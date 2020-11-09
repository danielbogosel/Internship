package courses.exercice3;

public class ReverseMain {
    public static void main(String[] args) {
        String[] content = new String[]{"1","2","3","-","+"};
        ReverseCalculatorService reverseCalculatorService = new ReverseCalculatorService();
        System.out.println(reverseCalculatorService.reverseCalculator(content));
    }
}
