package RecursiveCall.Factorial;

public class Factorial {
    public int factorial(int n){
        if(n>1){
            return n * factorial(n-1);
        }else{
            return 1;
        }
    }

    public int factorial2(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial2(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.factorial(5);
        System.out.println(result);

        int result2 = fact.factorial2(4);
        System.out.println(result2);
    }
}
