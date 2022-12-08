package transport;

public abstract class Transport {
    String brand;
    private String model;
    final int year;
    final String country;
    private String color;
    private int maxSpeed;
    boolean isRefilled;

    public Transport (String country, int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;}

        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        System.out.println("Конструктор транспорт");
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;}
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;}
    }

    public abstract void refill(String fuel);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }



    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
