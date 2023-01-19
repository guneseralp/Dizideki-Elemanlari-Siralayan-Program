import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Diziniz Kaç Elemandan Oluşacaktır ?: ");
        int n = sc.nextInt();
        int [] list = new int[n];

        for (int i = 0; i < list.length;i++){
            System.out.print(i + " indisli sayı: ");
            list[i] = sc.nextInt();

        }
        Arrays.sort(list);
        System.out.print("Oluşturulan Dizi: { ");
        for(int sayi: list){
            System.out.print(sayi + " ");
        }
        System.out.println(" }");

    }
}