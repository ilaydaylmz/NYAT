public class SicaklikAlgila {
    ISıcaklikAlgilayiciFactory sicaklikFactory;
    public SicaklikAlgila(ISıcaklikAlgilayiciFactory sicaklikFactory)
    {
        this.sicaklikFactory=sicaklikFactory;
    }
    public void basla(String msg) throws InterruptedException {
        System.out.println(msg);
        ISicaklik sicaklik= sicaklikFactory.factoryMethod();
        //ISicaklik sicaklik1= sicaklikFactory.factoryMethod();
    }
}
