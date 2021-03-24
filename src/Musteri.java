public class Musteri {

    //her musterinin adı soyadı, iletisim bilgileri ve sepeti olacak
    //sepetin cinsini daha sonra tespit edicem bi dk

    public String musteriAdi;
    public String musteriSoyadi;
    private int telNo;
    Sepet sepet;

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
    public Musteri(String musteriAdi,String musteriSoyadi,Sepet sepet){
        this.musteriAdi=musteriAdi;
        this.musteriSoyadi=musteriSoyadi;
        this.sepet=sepet;
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

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", sepet=" + sepet +
                '}';
    }
}
