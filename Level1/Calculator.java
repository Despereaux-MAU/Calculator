package despereaus_calculator.Level1;

//스캐너 끄기 위한 임포트 확인 완료.
import java.util.Objects;
//스캐너 임포트 확인 완료.
import java.util.Scanner;

public class Calculator {

    //메서드에서 매개변수 선언!!
    //더하기
    public long add(long a, long b) {
        //throw
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        return a + b;
    }

    // 빼기
    public long subtract(long a, long b) {
        //throw
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        return a - b;
    }

    // 곱하기
    public long multiply(long a, long b) {
        //throw
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        return a * b;
    }

    // 나누기
    public long divide(long a, long b) {
        //throw
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // 입력 받을 수 있게 스캐너 추가
        Scanner scanner = new Scanner(System.in);
        //메서드 불러오기
        Calculator calculator = new Calculator();

        while(true) {

            // scanner 출력
            System.out.println("첫 번째 숫자를 입력하세요:");
            long num1 = scanner.nextLong();

            System.out.println("두 번째 숫자를 입력하세요:");
            long num2 = scanner.nextLong();

            System.out.println("수행할 연산을 선택하세요 (+, -, *, /):");
            String calculate = scanner.next();

            long result = 0;

            // Try-Catch문
            try {
                //switch 문
                switch (calculate) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("잘못된 연산값을 입력하셨습니다.");
                        return;
                }
                // 결과값 출력
                System.out.println("결과: " + result);
                System.out.println("더 계산하시겠습니까? (종료하려면 'exit' 입력)");

                String text = scanner.next();
                if (Objects.equals(text, "exit")) {
                    break;
                }

                //Catch!
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
