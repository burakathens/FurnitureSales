public class Urun {

    public String urunAdi;
    public int urunFiyati;
    private int urunStogu;

    public Urun() {
    }

    public Urun(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public Urun(String urunAdi, int urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }

    public Urun(String urunAdi, int urunFiyati, int urunStogu) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.urunStogu = urunStogu;
    }

    public int getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(int urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public int getUrunStogu() {
        return urunStogu;
    }

    public void setUrunStogu(int urunStogu) {
        this.urunStogu = urunStogu;
    }
    public class OturmaGrubu extends Urun{

    }
    public class MutfakGrubu extends Urun {

    }
    public class YatakOdasi extends Urun {


    }
    public class CocukOdasi extends Urun {


    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", urunStogu=" + urunStogu +
                '}';
    }
}
