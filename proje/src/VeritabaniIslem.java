import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VeritabaniIslem implements IVeriTabani{
  private Connection baglan(){
      Connection conn = null;
      String url="jdbc:postgresql://localhost:5432/YetkiliKisi";
      try{
          conn=DriverManager.getConnection(url,"postgres","1");

      }catch (Exception e){
          e.printStackTrace();
      }
      return conn;
  }

    @Override
    public boolean girisYap(String k_adi, String pass) {
        try {
            boolean girisDurumu= false;
            Connection conn = this.baglan();

            String sql ="SELECT * FROM \"Kullanıcı\" WHERE \"Ad\"='" +k_adi+ "'and \"Sifre\"='"+pass+"'";

            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            conn.close();
            Thread.sleep(500);
            if(!rs.next())
            {
                System.out.println("Böyle bir kullanıcı bulunamadı...");
                girisDurumu=false;
            }
            else {
                System.out.println("Giris basarılı...");
                girisDurumu=true;
            }
            rs.close();
            stmt.close();
            return girisDurumu;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
