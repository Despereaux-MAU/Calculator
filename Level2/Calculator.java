package despereaus_calculator.Level2;

public class Calculator {
    public AddOperation addOperation;
    public SubtractOperation subtractOperation;
    public MultiplyOperation multiplyOperation;
    public DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubtractOperation subtractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.subtractOperation = subtractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }
}