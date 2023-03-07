import java.util.*;

public class Main {
    public static void main(String[] args) {
        Location city = new Location("New York", LocationType.CITY, 40.7128, -74.0060);
        Location airport = new Location("JFK", LocationType.AIRPORT, 40.6413, -73.7781);
        Road highway = new Road(RoadType.HIGHWAY, 50.0, 65.0);
        Road countryRoad = new Road(RoadType.COUNTRY_ROAD, 20.0, 45.0);

        System.out.println(city);
        System.out.println(airport);
        System.out.println(highway);
        System.out.println(countryRoad);
    }
}