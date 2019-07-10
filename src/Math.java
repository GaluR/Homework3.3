public class Math {

    boolean isEven(int a){
        boolean result = a%2 !=1;
       return result;
    }

    void isOdd(int a){
        boolean odd = !isEven(a);
        System.out.println(odd);
    }

    double circleField(double r){
        double field = 3.14 * r * r;
        return field;
    }

    int power(int a){
        int multiply = a*a;
        return multiply;
    }
}
