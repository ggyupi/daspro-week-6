import java.util.Scanner;
/**
 * Pemilihan2Percobaan305
 */
public class Pemilihan2Percobaan305 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input05.nextLine();
        System.out.print("Masukkan banyaknya penghasilan : ");
        penghasilan = input05.nextInt();

        if ((kategori.equals("pekerja"))) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasilan bersih : " + gajiBersih);
        } else if ((kategori.equals("pebisnis"))) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan kategori salah" );
            input05.close();
    }
}