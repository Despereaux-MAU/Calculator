package despereaus_calculator.Level2;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation(), new SubtractOperation(),new MultiplyOperation(), new DivideOperation());
        try {
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요:");
            long num1 = scanner.nextLong();

            System.out.println("두 번째 숫자를 입력하세요:");
            long num2 = scanner.nextLong();

            System.out.println("수행할 연산을 선택하세요 (+, -, *, /):");
            String calculate = scanner.next();

            long result = 0;

            switch (calculate) {
                case "+":
                    result = calculator.addOperation.operate(num1, num2);
                    break;
                case "-":
                    result = calculator.subtractOperation.operate(num1, num2);
                    break;
                case "*":
                    result = calculator.multiplyOperation.operate(num1, num2);
                    break;
                case "/":
                    result = calculator.divideOperation.operate(num1, num2);
                    break;
                default:
                    System.out.println("잘못된 연산값을 입력하셨습니다.");
                    return;
            }

                System.out.println("결과: " + result);
                System.out.println("더 계산하시겠습니까? (종료하려면 'exit' 입력)");

                String text = scanner.next();
                if (Objects.equals(text, "exit")) {
                    break;
                }
        }
    } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }scanner.close();
    }
}

