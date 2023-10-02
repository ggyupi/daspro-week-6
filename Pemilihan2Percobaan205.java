import java.util.Scanner;

/**
 * Pemilihan2Percobaan205
 */
public class Pemilihan2Percobaan205 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        double totalSudut;
        System.out.print("Masukkan sudut 1 : ");
        int sdtSegitiga1 = input05.nextInt();
        System.out.print("Masukkan sudut 2 : ");
        int sdtSegitiga2 = input05.nextInt();
        System.out.print("Masukkan sudut 3 : "); 
        int sdtSegitiga3 = input05.nextInt();
        totalSudut = sdtSegitiga1 + sdtSegitiga2 + sdtSegitiga3;
        if (totalSudut == 180) {
            if ((sdtSegitiga1 == 90) || (sdtSegitiga2 == 90) || (sdtSegitiga3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan segitiga");
        input05.close();
    }
}