import java.util.ArrayList;
import java.util.List;

public  class FizzBuzz {
    public static List<String> FizzBuzz(int n){
        List<String> list = new ArrayList<String>();
        for (int i=1; i<= n; i++)
            if (i % 3 != 0) {
                if (i % 5 != 0) {
                    list.add(String.format("%d", i));
                } else {
                    list.add("Buzz");
                }
            } else {
                if (i % 5 != 0) list.add("Fizz");
                else list.add("FizzBuzz");
            }
        return list;
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println(FizzBuzz.FizzBuzz(n).toString());
    }

}