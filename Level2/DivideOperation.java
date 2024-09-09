package despereaus_calculator.Level2;

public class DivideOperation extends AbstractOperation {
    @Override
    public long operate(long num1, long num2) {
        while (true) {
            if (num1 < 0 || num2 < 0) {
                System.out.println("음수는 입력할 수 없습니다.");
                break;
            }
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }
        return num1 + num2;}
}