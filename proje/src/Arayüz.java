import java.util.Scanner;

public class Arayüz {
    public void Arayuz() throws InterruptedException {
        IMerkeziİslemBirimi akilliCihaz = new MerkeziİslemBirimi();
        IObserver observer = new Observer();
        IObserver subscriber = new Subscriber1();
        IEkran ekran = new Ekran();
        VeritabaniIslem vb = new VeritabaniIslem();

        Scanner scan = new Scanner(System.in);
        int durum = 1;
        int secim = 0;
        System.out.println("Kullanıcı adı ve sifrenizi giriniz:");

        Scanner kullaniciadi = new Scanner(System.in);
        String kullaniciad = kullaniciadi.nextLine();

        Scanner sifre = new Scanner(System.in);
        String sifr = sifre.nextLine();
        String cevap = "e";

        if (vb.girisYap(kullaniciad, sifr) == true) {
            ekran.mesajGoruntule("Cihazı açmak için 1'e basınız.");
            durum = scan.nextInt();
            if (durum == 1) {
                ekran.mesajGoruntule("1)Sogutucu aç\n2)Sogutucu kapat\n3)Sıcaklık görüntüle");
                secim = scan.nextInt();

                if (secim == 1) {
                    akilliCihaz.sogutucuAc();
                    akilliCihaz.sogutucuKapat();
                }
                if (secim == 2) {
                    akilliCihaz.sogutucuKapat();
                }
                if (secim == 3) {
                    System.out.println("sıcaklık hangi cinsten görüntülensin? (K/C)");
                    Scanner sis = new Scanner(System.in);
                    String sistem = sis.next();
                    ISıcaklikAlgilayiciFactory sicaklik;
                    if (sistem.equalsIgnoreCase("K")) {
                        akilliCihaz.KelvinSıcaklık();

                    }
                    else {
                        akilliCihaz.CelciusSıcaklık();
                    }
                }
            } else {
                observer.sogutucuKapali("Sogutucu açılmadan işlem yapılmaz");
                subscriber.sogutucuKapali("Sogutucu açılmadan başka işlem yapılmaz");
            }

        }

    }
}

