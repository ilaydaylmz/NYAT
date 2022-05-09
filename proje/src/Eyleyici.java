public class Eyleyici implements IEyleyici{
    SicaklikAlgila sicaklikAlgilayici = new SicaklikAlgila(new CelciusFactory());

    public void sogutucuAc(int sicaklik) throws InterruptedException {
        System.out.println("Soğutucu açılıyor ... \nSıcaklık Düşürülüyor...");
        Thread.sleep(1000);
        sicaklik -=10;
        System.out.println("Sıcaklık:"+(sicaklik+10)+"'den "+(sicaklik)+" ye düşürüldü.");

    }
    public void sogutucuKapat() throws InterruptedException {
        System.out.println("Soğutucu Kapatılıyor...");
        Thread.sleep(1000);
        System.out.println("Soğutucu Kapatıldı...");

    }

}
