public class Exercise {
     static int sum(int a, int b) {
        if(a > 0 && b > Integer.MAX_VALUE - a) {
            throw new RuntimeException();
        } else if ( a < 0 && b < Integer.MIN_VALUE - a ) {
            throw new RuntimeException();
        }
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,Integer.MAX_VALUE));
    }



}
