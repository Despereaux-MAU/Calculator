package despereaus_calculator.Level2;

public class DivideOperation {
    public long operate(long a, long b) {
        while (true) {
            if (a < 0 || b < 0) {
                throw new ArithmeticException("음수는 입력할 수 없습니다.");
            }else if (b == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            return a / b;
        }
    }
}