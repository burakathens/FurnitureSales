import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    public static Runner runner=new Runner();
    //static ArrayList sepet=new Sepet();
    static Musteri musteri=new Musteri();
    static Urun urun1=new Urun();

    static Katalog katalog=new Katalog();

    Scanner tara=new Scanner(System.in);
   // static ArrayList<Urun> arrayList=new ArrayList<>();


    int sira =99;
    public static int donence=0;

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



        ArrayList<Urun> spt= musteri.Sepet;

        runner.MusteriKayit();
        //katalogtan urunleri stoklarıyla olusturalım
        katalog.CocukOdasiGrubu();
        katalog.CocukOdasiGrubu().setUrunStogu(5);
        katalog.OturmaGrubu();
        katalog.OturmaGrubu().setUrunStogu(3);
        katalog.MutfakGrubu();
        katalog.MutfakGrubu().setUrunStogu(2);
        katalog.YatakGrubu();
        katalog.YatakGrubu().setUrunStogu(6);



        int syc=0;



        while (donence < 6) {
            if (katalog.YatakGrubu().getUrunStogu()!=0&&katalog.MutfakGrubu().getUrunStogu()!=0
                    &&katalog.OturmaGrubu().getUrunStogu()!=0&&katalog.CocukOdasiGrubu().getUrunStogu()!=0) {

                int m = runner.MusteriTalebi();

                urun1 = UrunuHazirla(m);
                spt.add(donence,urun1);
                musteri.setSepet(spt);

               // sepet.sepetList.add(syc, urun1);
                syc++;
                System.out.println("------------------------");
                System.out.println("mevcut sepetiniz: ");
                System.out.println(musteri.Sepet.toString());
                System.out.println(musteri.Sepet.toString());
                StokAzalt(m);
                //stok azaldıktan sonra da yazdırdım azaldıgını goreyım diye
                System.out.println(musteri.Sepet.toString());


                donence++;
            }
        }






    }
    public void MusteriKayit(){

        System.out.println("Adınız: ");
         musteri.musteriAdi= tara.next();
        System.out.println("Soyadınız: ");
        musteri.musteriSoyadi=tara.next();
        System.out.println("Telefon Numaranız: ");
        int b=tara.nextInt();
        musteri.setTelNo(b);

    }
    public int MusteriTalebi(){
        //musteriye urunleri soralım
        System.out.println("Sayın "+musteri.musteriAdi+" "+musteri.musteriSoyadi);
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
    public static Urun UrunuHazirla(int urunsirasi){
       switch (urunsirasi) {
           case 1:
               return katalog.OturmaGrubu();
           case 2:
               return katalog.MutfakGrubu();

           case 3:
               return katalog.YatakGrubu();

           case 4:
               return katalog.CocukOdasiGrubu();

           default:
               return null;

       }
    }


    public static void StokAzalt(int m){
        switch (m){

            case 1:
                int t=musteri.Sepet.get(donence).getUrunStogu();
                katalog.OturmaGrubu().setUrunStogu(t-1);
                break;
            case 2:
                int tt=musteri.Sepet.get(donence).getUrunStogu();
                katalog.MutfakGrubu().setUrunStogu(tt-1);
                break;
            case 3:
                int ttt=musteri.Sepet.get(donence).getUrunStogu();
                katalog.YatakGrubu().setUrunStogu(ttt-1);
                break;
            case 4:
                int tttt=musteri.Sepet.get(donence).getUrunStogu();
                katalog.CocukOdasiGrubu().setUrunStogu(tttt-1);
                break;
        }
    }

}


