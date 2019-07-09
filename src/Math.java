public class Math {

    boolean isEven(int a){
        int div = a%2;
        boolean result = div !=1;
       return result;
    }

    boolean isOdd(int a){
        int div = a%2;
        boolean result = div !=0;
        return result;
    }

    double circleField(double r){
        double field = 3.14 * r * r;
        return field;
    }

    int power(int a){
        int mul = a*a;
        return mul;
    }
}
