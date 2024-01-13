import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceți un cuvânt: ");
        String c = in.nextLine();
        afisaremijloc(c);
    }

    public static void afisaremijloc(String c) {

        if (c.length() % 2 == 0)
        {
            int mij1 =c.length() / 2 - 1;
            int mij2 = c.length() / 2;
            System.out.println("Caracterele din mijloc sunt: " + c.charAt(mij1) + c.charAt(mij2));
        }
        else
        {
            int mij = c.length() / 2;
            System.out.println("Caracterul din mijloc este: " + c.charAt(mij));
        }
    }
}