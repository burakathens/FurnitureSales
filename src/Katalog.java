public class Katalog {

    public static Urun urun=new Urun();
   static Katalog katalog=new Katalog();
    //Runnerda hazırladıgımız urunHazıra methodunu doldurmak icin
    // katalog sınıfını yazdım. ornegın magazaya yenı urun gelirse
    //urunu hazırla metodunda case durumunu artırıp
    //burada olusturdugumuz yenı metodu baglayacagız boylelikle surdurulebilir canlı bir uygulamamız olacak

    public Katalog() {
    }

    public Urun OturmaGrubu(){
        urun.urunAdi="Oturma Grubu";
        urun.setUrunFiyati(2300);


        return urun;
    }
    public Urun MutfakGrubu(){
        urun.urunAdi="Mutfak Grubu";
        urun.setUrunFiyati(3300);


        return urun;
    }
    public Urun YatakGrubu(){
        urun.urunAdi="Yatak Odası Grubu";
        urun.setUrunFiyati(5300);


        return urun;
    }
    public Urun CocukOdasiGrubu(){
        urun.urunAdi="Cocuk Odası Grubu";
        urun.setUrunFiyati(5300);


        return urun;
    }

}
