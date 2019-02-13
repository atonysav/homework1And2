import java.util.Random;

public class Main7 {
    public static void main(String[] args){
        Random rand = new Random();
        int a=rand.nextInt(100);
        System.out.println("a = " + a);
        int b;
        String s="";
        do{
            b=a%2;
            s=b+s;
            a=a/2;
        }
        while (a>=1 || a==2);
        System.out.println("в двоичной системе: \n" + s);
    }
}
