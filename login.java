import java.util.Scanner;

public class login{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 100000, tarik, tambah;
        int pilihan;
        String user, pw;
        String username = "admin";
        String password = "123";

        System.out.print("Masukkkan username: ");
        user = input.nextLine();
        System.out.print("Masukkkan password: ");
        pw = input.nextLine();

        if ((user.equals(username))) {
            if ((pw.equals(password))) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Password salah");
            }
        } else {
            System.out.println("Username salah");
}

        System.out.println("");
        System.out.println("********** Bank Suka Maju **********");
        System.out.println("-----------------------------------");
        System.out.println("\n1.Cek Saldo");
        System.out.println("2.Simpan Uang");
        System.out.println("3.Ambil Uang");
        System.out.println("4.History Transaksi");
        System.out.println("5.Help");
        System.out.println("6.keluar");
        System.out.print("\nPilih Menu : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
            break;
            case 2:
            System.out.println("======================================");
            System.out.println("    Nominal Yang Ingin Anda Tambah");
            System.out.println("======================================");
            System.out.print("  Isi Nominal: ");
            tambah = input.nextDouble();
            saldo += tambah;
            System.out.println("Jumlah Uang Yang Ditambah: " + tambah);
            System.out.println("      Saldo Saat Ini: " + saldo);
            break;
            case 3:
            System.out.println("isi uang yang ingin ditarik");
            System.out.print("Isi nominal : ");
            tarik = input.nextDouble();
            saldo -= tarik;
            System.out.println("sisa saldo : " + saldo);
            System.out.println("jumlah uang yang ditarik : " + tarik);
            break;
            case 4:
            break;
            case 5:
            
            break;
            case 6:
            System.exit(0);
            break;
            default:
            System.exit(0);
        }
        input.close();
    }
}