public class Senjata {

    private String bunyi;
    private boolean menusuk;
    private int peluru;
    

    public Senjata(String Bunyi){

        this.bunyi = Bunyi;

    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public void setBunyi(String bunyi){
        this.bunyi=bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int s){
        this.peluru = s;
    }
}
