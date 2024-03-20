
import java.util.Scanner;

/*Yang terjadi jika fungsi luas di abstract tidak di extend dan di berikan argumen tambahan, maka fungsi luas tidak bisa dipakai di fungsi main*/

public class MbujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar hs = new BujurSangkar();
        System.out.print("Masukkan sisi: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " +hs.hitungLuas(sisi));
        scan.close(); // Close the Scanner object
    }
}
