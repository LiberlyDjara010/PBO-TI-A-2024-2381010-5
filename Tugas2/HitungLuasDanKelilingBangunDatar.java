package Tugas2;

import java.util.Scanner;

public class HitungLuasDanKelilingBangunDatar {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:\n ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.print("\tMasukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("\tMasukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                System.out.println("\tLuas persegi: " + hitungLuasPersegi(sisi));
                System.out.println("\tKeliling persegi: " + hitungKelilingPersegi(sisi));
                break;

            case 2:
                System.out.print("\tMasukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("\tMasukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                System.out.println("\tLuas persegi panjang: " + hitungLuasPersegiPanjang(panjang, lebar));
                System.out.println("\tKeliling persegi panjang: " + hitungKelilingPersegiPanjang(panjang, lebar));
                break;

            case 3:
                System.out.print("\tMasukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                System.out.println("\tLuas lingkaran: " + hitungLuasLingkaran(jariJari));
                System.out.println("\tKeliling Lingkaran: " + hitungKelilingLingkaran(jariJari));
                break;

            default:
                System.out.println("PILIHAN TIDAK VALID!");
        }
        scanner.close();
    }
}
