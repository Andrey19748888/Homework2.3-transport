package transport;

public class Bus extends Transport {



    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }


    @Override
    public void refill(String fuel) {
        if (fuel.equalsIgnoreCase("Дизель")) {
            System.out.println("Поезд заправлен. Топливо: " + fuel);
            isRefilled = true;
        } else {
            System.out.println("Это топлево не походит для поезда");
        }




    }



}
