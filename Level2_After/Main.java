package despereaus_calculator.Test_After;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            //연산자가 먼저 출력되도록 수정
            System.out.println("수행할 연산을 선택하세요(+, -, *, /, del, print [나가기 : 'exit'])");
            String operation = scanner.next();
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            // 첫 결과 삭제
            if (operation.equals("del")) {
                calculator.removeFirstResult();
                continue;
            }

            // 모든 결과 출력
            if (operation.equals("print")) {
                calculator.printAllResults();
                continue;
            }

            // 첫 번째 숫자 입력
            System.out.println("첫 번째 숫자를 입력하세요.");
            String input = scanner.next();

            long num1;
            try {
                num1 = Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }

            // 두 번째 숫자 입력
            System.out.println("두 번째 숫자를 입력하세요.");
            input = scanner.next();

            long num2;
            try {
                num2 = Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }

            long result = 0;

            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    System.out.println("결과: " + result);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    System.out.println("결과:" + result);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    System.out.println("결과: " + result);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    System.out.println("결과: " + result);
                    break;
                default:
                    System.out.println("잘못된 연산을 입력하셨습니다.");
                    break;
            }
        }

        scanner.close();
    }
}
