
import java.util.Scanner;


public class HitungBangunDatar {
    public static void main(String[] args) {
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Bujur Sangkar");
        System.out.print("Pilih: ");
        Scanner sc = new Scanner(System.in);
        
        int pilih = sc.nextInt();
        
        if (pilih==1){
            System.out.print("Isi Nilai Panjang : ");
            int p = sc.nextInt();
            System.out.print("Isi Nilai Lebar : ");
            int l = sc.nextInt();
            PersegiPanjang pp = new PersegiPanjang(p,l);
            int Luas = pp.getLuas();
            int Keliling = pp.getKeliling();
            
            System.out.println("Luas Persegi Panjang : " + Luas);
            System.out.println("Keliling Persegi Panjang : " + Keliling);
        }
        
        else if(pilih==2){
            System.out.print("Isi Nilai Sisi : ");
            int s = sc.nextInt();
            BujurSangkar bs = new BujurSangkar(s);
            int Luas = bs.getLuas();
            int Keliling = bs.getKeliling();
            
            System.out.println("Luas Bujur Sangkar : " + Luas);
            System.out.println("Keliling Bujur Sangkar : " + Keliling);
        }
    }
}
