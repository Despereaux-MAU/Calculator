package despereaus_calculator.Test_After;

import java.util.LinkedList;
import java.util.List;

public class Calculator {
    // 결과 저장 리스트
    private List<Long> results = new LinkedList<>();

    // Setter(결과값 저장 메서드)
    public void addResult(long result) {
        results.add(result);
    }

    // Getter(결과값 반환 메서드)
    public void printAllResults() {
        if (results.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("저장된 결과들: " + results);
        }
    }

    // 가장 먼저 저장된 결과값을 삭제하는 메서드
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    // 더하기
    public long add(long a, long b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        long result = a + b;
        addResult(result); // 결과 저장
        return result;
    }

    // 빼기
    public long subtract(long a, long b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        long result = a - b;
        addResult(result); // 결과 저장
        return result;
    }

    // 곱하기
    public long multiply(long a, long b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        long result = a * b;
        addResult(result); // 결과 저장
        return result;
    }

    // 나누기
    public long divide(long a, long b) {
        if (b == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else if (a < 0 || b < 0) {
            throw new ArithmeticException("음수는 입력할 수 없습니다.");
        }
        long result = a / b;
        addResult(result); // 결과 저장
        return result;
    }
}