package day2;

public class FunctionsMethods {
    int result; int x = 10; int y = 22;

    public static void main(String[] args) {
        FunctionsMethods classObj = new FunctionsMethods();
        classObj.addition();
        classObj.division();
        classObj.substraction();
    }

    public void addition() {
        result = x+y;
        System.out.println("Addition: " + result);
    }
    public void substraction() {
        result = y-x;
        System.out.println("substraction: " + result);
    }
    public void division() {
       float result = y/x;
        System.out.println("division: " + result);
    }
}
