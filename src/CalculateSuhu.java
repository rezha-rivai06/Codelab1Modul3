

public class CalculateSuhu {
    public void CekSuhu(int suhu) {
        if (suhu <= 0) {
           System.out.println("Berbahaya Suhu sangat dingin (beku)");
        } else if(suhu <=20){
            System.out.println("Tetap waspada suhu relatif dingin");
        } else if(suhu <=30){
            System.out.println("Suhu Normal (aman)");
        } else if(suhu >31){
            System.out.println("Berbahaya Suhu sangat Panas (Hindari aktivitas diluar Rumah");
        } else{
            System.out.println("Terjadi kesalahan");
        }
    }

    public void perbandngansuhu (int suhusekarang, int suhu1jlalu){
        int selisih = Math.abs(suhusekarang - suhu1jlalu);
        if(suhusekarang > suhu1jlalu){
            System.out.println("Waspada suhu meningkat"+ selisih +"Dari 1 Jam lalu");
        }else if(suhusekarang < suhu1jlalu){
            System.out.println("Suhu mengalami penurunan"+ selisih +"Dari 1 Jam lalu");
        } else if(suhusekarang == suhu1jlalu){
            System.out.println("Suhu tidak mengalami perubahan");
        }
    }
}