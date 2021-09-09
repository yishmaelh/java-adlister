public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
            adsDao = new MySqlAdsDao(config);
        }
        return adsDao;
    }
}
