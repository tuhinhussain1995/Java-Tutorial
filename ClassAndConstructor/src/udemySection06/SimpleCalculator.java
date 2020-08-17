package udemySection06;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }
    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }
    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }
    public double getDivisionResult() {

        if(this.secondNumber == 0){
            return 0;
        }

        return (this.firstNumber / this.secondNumber);
    }

    public void display(){
        setFirstNumber(5.0);
        setSecondNumber(4);
        System.out.println("add= " + getAdditionResult());
        System.out.println("Subtract= " + getSubtractionResult());

        setFirstNumber(5.25);
        setSecondNumber(0);

        System.out.println("multiply= " + getMultiplicationResult());
        System.out.println("divide= " + getDivisionResult());
    }

}
