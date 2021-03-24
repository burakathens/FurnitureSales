import java.util.Scanner;

public class Runner {


    public static Runner runner=new Runner();
    Scanner tara=new Scanner(System.in);
    int sira =99;

    public static void main(String[] args) {
        //musterinin talebini alan bi method yaz
        // ornegin; ahmet isimli kisi gelecek
        // musteriye hangi ürünü almak istediğini sorsun
        // alacağı urunu sectir ve sepete eklet urunleri
        //satıs onayı alınca
        // musterinin bilgileriyle birlikte satılacak urunleri kayıt yap.
        // (bu kaydı ekrana yazdır fis vb gibi )
        //
        //

       runner.MusteriTalebi();
       Musteri musteri1=new Musteri("mehmet","cakmak",new Sepet() );
       Urun urun=new Urun("yatak");
       urun.setUrunFiyati(900);
       urun.setUrunStogu(4);
       musteri1.sepet.sepetList.add(urun);
        System.out.println(musteri1.toString());


    }
    public int MusteriTalebi(){
        //musteriye urunleri soralım
        System.out.println("---- XXX Mobilya Mağazamıza Hoşgeldiniz ----");
        System.out.println("--------------------------------------------");
        System.out.println("Almak istediğiniz ürünün sırasını seciniz: ");
        System.out.println("--------------------------------------------");
        System.out.println("1- Oturma Grubu");
        System.out.println("2- Mutfak Grubu");
        System.out.println("3- Yatak Odası Grubu");
        System.out.println("4- Cocuk Odası Grubu");
        System.out.println("--------------------------------------------");
        System.out.print(">> ");
        sira=tara.nextInt();



        return sira;

    }
}
