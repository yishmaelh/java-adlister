import java.util.List;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import com.mysql.cj.jdbc.Driver;

public class MySqlAdsDao implements Ads{
    private Connection connection;

    public MySqlAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while(resultSet.next()){
                ads.add(new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                ));
            }
        }catch(SQLException e){
            throw new RuntimeException("Error retrieving all ads.", e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


}
