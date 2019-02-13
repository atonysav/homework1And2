import java.util.Random;

/*public class Main{
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));*//*
    }
}*/
/*import java.util.*;*/
public class Main {
    public static void main(String[] args) {
        /*System.out.println(new Date());*/
        int i, j, k = 2;
        int min = 5;
        int max = 155;
        int diff = max - min;
        Random rand = new Random();
        j = rand.nextInt(diff ) + 1;
        j += min;
        i = j;
        System.out.println("j = " + j);
        System.out.println("i = j = " + i);
        System.out.println("k = " + k);
        {
            if (j > 25 && j < 100) {
                System.out.println("Число " + j + " содержиться в интервале (25:100)");
            } else {
                System.out.println("Число " + j + " не содержиться в интервале (25:100)");
            }
        }
        System.out.println("j = " + j + " j/k = " + (j/k+1));
        /*j %= k;
        System.out.println("j %/ k = " + j);*/
        i=(j/k+1)*2;
        System.out.println("i = " + i);
        }
    }


