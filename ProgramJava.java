import java.util.Scanner;

public class ProgramJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = input.nextInt();

        double[] angka = new double[jumlahAngka];

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < jumlahAngka; i++) {
            total += angka[i];
        }

        double rataRata = total / jumlahAngka;

        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Angka yang lebih besar dari rata-rata:");
        for (int i = 0; i < jumlahAngka; i++) {
            if (angka[i] > rataRata) {
                System.out.println(angka[i]);
            }
        }

        System.out.println("Angka yang lebih kecil dari rata-rata:");
        int i = 0;
        while (i < jumlahAngka) {
            if (angka[i] < rataRata) {
                System.out.println(angka[i]);
            }
            i++;
        }

        input.close();
    }
}
