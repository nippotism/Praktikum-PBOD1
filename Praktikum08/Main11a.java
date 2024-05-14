// Nama         : Syariful Hanif Setiawan
// NIM          : 24060122130095
// Tanggal      : 10 Mei 2024 

class Kupu {
    void gerak(){
    }
}

class Ulat extends Kupu {
    void gerak(){
        System.out.println("ulat merayap");
    }
}

class Data <T> {
    T isi;
    T getIsi(){
        return this.isi;
    }

    void setIsi (T x) {
        this.isi = x;
    }
}

public class Main11a {
    public static void main(String[] args) {
        // kamus
        Ulat K;
        Data <Kupu> anu;

        // algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}
