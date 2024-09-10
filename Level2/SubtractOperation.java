package despereaus_calculator.Level2;

public class SubtractOperation {
    public long operate(long a, long b) {
        while (true) {
            if (a < 0 || b < 0) {
                throw new ArithmeticException("음수는 입력할 수 없습니다.");
            }return a - b;
        }
    }
}