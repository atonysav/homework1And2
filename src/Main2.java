import java.util.Random;

public class Main2 {
    public static void main(String[] args){
        int j;
        int k;
        int l;
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random rand = new Random();
        j = rand.nextInt(diff ) + 1;
        j += min;
        System.out.println("j = " + j);
        if ( j > 0 && j < 15){
            k=8;
            System.out.println("остаток от деления на 8");
            System.out.println(j%=k);
        }
        else if (j>=15 && j<=20){
            k=8;
            l=10;
            System.out.println("остаток от деления на 8");
            System.out.println(j%=k);
            System.out.println("остаток от деления на 10");
            System.out.println(j%=l);
        }
        else if (j>20 && j<45){
            l=10;
            System.out.println("остаток от деления на 10");
            System.out.println(j%=l);
        }
        else if (j>45 && j<=70){
            j=j*5/8;
            System.out.println("умножение на 5/8");
            System.out.println(+ j);
        }
        else {
            j = j / 5;
            System.out.println("деление на 5");
            System.out.println("j / 5 =  " + j);
        }
    }
}
