public class Observer implements IObserver {

    @Override
    public void sogutucuAcik(String mesaj) {
        System.out.println(mesaj);
    }

    @Override
    public void sogutucuKapali(String mesaj) {
        System.out.println(mesaj);
    }
}
