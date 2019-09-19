package djb;

public class Main {
    public static void main (String[] args) {
        int arg;
        for (int i = 0; i < args.length; i++) {
            arg = Integer.parseInt(args[i]);
            System.out.println(arg);
        }
    }
}