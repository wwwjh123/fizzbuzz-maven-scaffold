public class FizzBuzzWhizzTest {
    public static String[] getTuil(int a,int b,int c,int n){
        String[] t = new String[n];
        for(int i=1;i<=n;i++){
            if (rule5(i,a)){
                t[i-1] = "Fizz";
            }else if(rule42(i,a,b,c)){
                t[i-1] = "FizzBuzzWhizz";
            }else{
                String bb = rule41(i,a,b,c);
                if (!(i+"").equals(bb)){
                    t[i-1] = bb;
                }else{
                    t[i-1] = rule3(i,a,b,c);
                }
            }
        }
        return t;
    }

    private static String rule3(int i, int a, int b, int c) {
        if (i%a==0){
            return "Fizz";
        }
        if (i%b==0){
            return "Buzz";
        }
        if (i%c==0){
            return "Whizz";
        }
        return i+"";
    }

    private static String rule41(int i, int a, int b, int c) {
        if  (i%a==0 && i%b==0 ) {
            return "FizzBuzz";
        }else if (i%b==0 && i%c==0) {
            return "BuzzWhizz";
        }else if(i%a==0 && i%c==0){
            return "FizzWhizz";
        }
        return i+"";
    }

    private static boolean rule42(int i, int a, int b, int c) {
        return i%a==0 && i%b==0 && i%c==0;
    }

    private static boolean rule5(int i, int a) {
        String str = String.valueOf(i);
        return str.indexOf(a+"") != -1;
    }


    public static void main(String[] args) {
        String strs[] = getTuil(3, 5, 7, 100);
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
