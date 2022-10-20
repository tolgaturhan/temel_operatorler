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

        int e = 2, f = 8;
        //f = f + e;
        //f = f - e;
        //f = f * e;
        //f = f / e;
        //f = f % e;
        f += e;
        f -= e;
        f *= e;
        f /= e;
        f %= e;
        System.out.println(f);

        int g = 10 , h = 1;
        boolean sonuc = g > h;
        System.out.println(sonuc);

        int xx = -12, yy = -5;

        System.out.println(xx % yy);



    }
}
