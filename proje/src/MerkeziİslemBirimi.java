public class MerkeziİslemBirimi  implements IMerkeziİslemBirimi{
    private final IEkran ekran;
    private final IEyleyici eyleyici;
    private ISıcaklikAlgilayiciFactory sıcaklikAlgilayiciFactory;
    Celcius celcius = new Celcius();


    int sonsicaklik= celcius.sicaklik();

    public MerkeziİslemBirimi() throws InterruptedException {

        this.ekran= new Ekran();
        this.eyleyici = new Eyleyici();

    }
    @Override
    public void sogutucuAc() throws InterruptedException {

        this.eyleyici.sogutucuAc(this.sonsicaklik);
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        this.eyleyici.sogutucuKapat();
    }


    @Override
    public void KelvinSıcaklık() throws InterruptedException {
        sıcaklikAlgilayiciFactory= new KelvinFactory();
        SicaklikAlgila sicaklikAlgila= new SicaklikAlgila(sıcaklikAlgilayiciFactory);
        sicaklikAlgila.basla("Kelvin:");
    }

    @Override
    public void CelciusSıcaklık() throws InterruptedException {
      sıcaklikAlgilayiciFactory =new CelciusFactory();
      SicaklikAlgila sicaklikAlgila = new SicaklikAlgila(sıcaklikAlgilayiciFactory);
      sicaklikAlgila.basla("Celcius:");
    }
}
