package com.kodilla.exception.test;

public class FirstChallenge {
    static int count = 0;

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Error. Cannot divide by 0.");
        }
        finally {
            count++;
            System.out.print("Program executed " + count);
            if(count == 1) {
                System.out.println(" time.");
            }
            else {
                System.out.println(" times.");
            }
        }
    }
}
