package despereaus_calculator.Level2;

public class Calculator {

    public AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void SetOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public long calculate(long num1, long num2) {
        long answer = 0;
        answer = operation.operate(num1, num2);
        return answer;
    }

    public AddOperation addOperation;
    public SubtractOperation subtractOperation;
    public MultiplyOperation multiplyOperation;
    public DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubtractOperation subtractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.subtractOperation = subtractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    //양의 정수 입력,
    public long calculate(String operator, long num1, long num2) {
        long answer = 0;

        if(operator.equals("+")){
            answer = addOperation.operate(num1, num2);
        } else if(operator.equals("-")) {
            answer = subtractOperation.operate(num1, num2);
        } else if(operator.equals("*")) {
            answer = multiplyOperation.operate(num1, num2);
        } else if(operator.equals("/")) {
            answer = divideOperation.operate(num1, num2);
        }
        return answer;
    }
}
