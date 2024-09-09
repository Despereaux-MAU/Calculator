package despereaus_calculator.Level2;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public long operate(long num1, long num2) {
        while (true) {
            if (num1 < 0 || num2 < 0) {
                System.out.println("음수는 입력할 수 없습니다.");
                break;
            }
        }
        return num1 - num2;}
}