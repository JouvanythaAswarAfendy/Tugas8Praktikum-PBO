package tugas7praktikum;

import java.util.Scanner;

public class Tugas8Praktikum {

    public static void main(String[] args) {
        String[] kode = new String[10];
        String[] brg = new String[10];
        int[] hrg = new int[10];
        int[] jmlh_beli = new int[10];
        int[] jmlh_byr = new int[10];
        int total_bayar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("* TOKO SERBA ADA *");
        System.out.println("******************\n");
        System.out.print("Masukan Item Barang : ");
        int data = input.nextInt();
        System.out.println(" ");

        for (int i = 0; i < data; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            kode[i] = input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            jmlh_beli[i] = input.nextInt();
            System.out.println(" ");

            switch (kode[i]) {
                case "a001":
                    brg[i] = "Buku";
                    hrg[i] = 3000;
                    break;
                case "a002":
                    brg[i] = "Pensil";
                    hrg[i] = 4000;
                    break;
                case "a003":
                    brg[i] = "Pulpen";
                    hrg[i] = 5000;
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
                    break;
            }

            jmlh_byr[i] = hrg[i] * jmlh_beli[i];
            total_bayar += jmlh_byr[i];
        }

        System.out.println("");
        System.out.println("******************");
        System.out.println("* TOKO SERBA ADA *");
        System.out.println("******************");
        System.out.println("No    Kode Barang    Nama Barang     Harga    Jumlah Beli     Jumlah Bayar");
        System.out.println("============================================================================");
        for (int i = 0; i < data; i++) {
            System.out.printf("%-5s %-15s %-15s %-10d %-14d %-12d%n",
                i + 1, kode[i], brg[i], hrg[i], jmlh_beli[i], jmlh_byr[i]);
        }
        System.out.println("============================================================================");
        System.out.printf("Total Bayar                                                     %d%n", total_bayar);
        System.out.println("============================================================================");

    }
}