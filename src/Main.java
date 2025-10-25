
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inputsuhu = new Scanner(System.in);
        System.out.println("Program Deteksi Suhu");

        System.out.println("Suhu sekarang :");
        int suhu = inputsuhu.nextInt();

        System.out.println("Suhu 1 Jam yang lalu :");
        int suhu1jlalu = inputsuhu.nextInt();

        CalculateSuhu deteksi = new CalculateSuhu();

        deteksi.CekSuhu(suhu);
        deteksi.perbandngansuhu(suhu, suhu1jlalu);

        inputsuhu.close();
    }
}