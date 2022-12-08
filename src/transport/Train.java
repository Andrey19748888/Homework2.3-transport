package transport;

public class Train extends Transport {
    private double tripPrice; // цена
    private double travelTime; // время в пути
    private String departureStation; // отправление
    private String arrivalStation; // конечная стонция
    private int numberOfWagons; // кол-во вагонов


    public Train(double tripPrice, double travelTime, String departureStation, String arrivalStation, int numberOfWagons, String brand,
                 String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill(String fuel){
        if (fuel.equalsIgnoreCase("Дизель")) {
            System.out.println("Поезд заправлен. Топливо: " + fuel);
            isRefilled = true;
        } else {
            System.out.println("Это топлево не походит для поезда");
        }
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
