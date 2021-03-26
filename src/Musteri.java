import java.util.ArrayList;

public class Musteri {

    //her musterinin adı soyadı, iletisim bilgileri ve sepeti olacak
    //sepetin cinsini daha sonra tespit edicem bi dk

    public String musteriAdi;
    public String musteriSoyadi;
    private int telNo;
    public ArrayList<Urun> Sepet=new ArrayList<>();

    public Musteri(){

    }
    public Musteri(String musteriAdi,String musteriSoyadi){
        this.musteriAdi=musteriAdi;
        this.musteriSoyadi=musteriSoyadi;
    }
    public Musteri(String musteriAdi,String musteriSoyadi,int telNo){
        this.musteriSoyadi=musteriSoyadi;
        this.musteriAdi=musteriAdi;
        this.telNo=telNo;
    }
    public Musteri(String musteriAdi,String musteriSoyadi,ArrayList<Urun> sepet){
        this.musteriAdi=musteriAdi;
        this.musteriSoyadi=musteriSoyadi;
        this.Sepet=sepet;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    public ArrayList<Urun> getSepet() {
        return Sepet;
    }

    public void setSepet(ArrayList<Urun> sepet) {
        this.Sepet = sepet;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", sepet=" + Sepet +
                '}';
    }
}
