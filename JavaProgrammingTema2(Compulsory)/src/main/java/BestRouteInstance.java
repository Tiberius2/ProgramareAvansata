import java.util.*;

public class BestRouteInstance {
    private List<Location> locations;
    private List<Road> roads;

    public BestRouteInstance(List<Location> locations, List<Road> roads) {
        this.locations = locations;
        this.roads = roads;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}
