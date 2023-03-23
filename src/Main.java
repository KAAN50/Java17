import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        k = girdi.nextInt();

        for (int i = 1; i <= k; i*=4,i*=5)
        {
            System.out.println(i);

        }
       


    }
}