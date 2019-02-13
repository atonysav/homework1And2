public class Main5 {
    public static void main (String[] args){
        int i = 545, core, add;
        String s = "";
        while (i / 8 >= 7 || i == 8) {
            core = i / 8;
            add = i % 8;
            s = add + s;
            i = core;
        }
        s = i + s;
        System.out.println(s);
    }
}
