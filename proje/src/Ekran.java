import java.time.LocalDateTime;

public class Ekran implements IEkran
{
    @Override
    public void mesajGoruntule(String mesaj) {
        System.out.println(mesaj);
    }
}
