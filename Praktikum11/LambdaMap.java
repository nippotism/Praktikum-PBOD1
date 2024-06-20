import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat sebuah Map dengan key NIM dan value nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("123456", "Adi");
        mahasiswaMap.put("234567", "Bambang");
        mahasiswaMap.put("345678", "Cici");
        mahasiswaMap.put("456789", "Didi");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}