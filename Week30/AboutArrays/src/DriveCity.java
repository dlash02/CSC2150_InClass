public class DriveCity {
    public static void main(String[] args) {
        String chiSub[] = { "Naperville", "Aurora", "Berwyn"};
        int chiTraval[] = { 25, 30, 20};
        City chicago = new City( "Chicago", "Illinos", 3200000, chiSub, chiTraval );
        System.out.printf("\n City Name:%s NumbSuburb:%s Perc:%3.3f", chicago.getName(),
                chicago.getSuburb().length, chicago.getPopPerSuburb());


        showCityInfo( chicago );
        String nySubs[] = { "Yonkers", "Long Island", "Jericho"};
        int nyTraval[] = { 25, 40, 40};
        City  ny = new City( "New York", "NY", 6600000, nySubs, nyTraval );
        showCityInfo( ny );

        City[] myCities = new City[] { chicago, ny };
        for ( City city : myCities ) {
            showCityInfo( city );
        }
    }

    private static void showCityInfo(City city ) {
        System.out.printf("\n City Name:%s NumbSuburb:%s Perc:%3.3f", city.getName(),
                city.getSuburb().length, city.getPopPerSuburb());
    }
}
