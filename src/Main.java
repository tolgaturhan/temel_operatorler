public class Main {
    public static void main(String[] args) {
        int a=5,b=1;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); // a'nın b'ye bölümünden kalan

        int c = 7;
        int d = c;
        System.out.println(d);

        int e = 5, f = 8;
        //b = b + a;
        //b = b - a;
        //b = b * a;
        //b = b / a;
        //b = b % a;
        b += a;
        b -= a;
        b *= a;
        b /= a;
        b %= a;
        System.out.println(b);


    }
}
