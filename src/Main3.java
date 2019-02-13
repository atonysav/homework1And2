import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int b;
        String i = "";
        Random rand = new Random();
        int a = rand.nextInt(1000);
        System.out.println(a);

        do {
            b = a % 16;
            if (b == 10) {
                i = "A" + i;
            } else if (b == 11) {
                i = "B" + i;
            } else if (b == 12) {
                i = "C" + i;
            } else if (b == 13) {
                i = "D" + i;
            } else if (b == 14) {
                i = "E" + i;
            } else if (b == 15) {
                i = "F" + i;
            } else {
                i = b + i;
            }
            a = a / 16;
        }
        while (a >= 15 );

        if (a == 10) {
            i = "A" + i;
        } else if (a == 11) {
            i = "B" + i;
        } else if (a == 12) {
            i = "C" + i;
        } else if (a == 13) {
            i = "D" + i;
        } else if (a == 14) {
            i = "E" + i;
        } else if (a == 15) {
            i = "F" + i;
        } else {
            i = a + i;
        }
        //i = a + i;
        System.out.println("в шестнадцатиричной системе: \n" + i);

    }
}