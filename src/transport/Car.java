package transport;

import java.time.LocalDate;

public class Car extends Transport {

    public double engineVolume;
    public String transmission;
    private final String typeOfCar;
    public String carNumber;
    private final int seatsCount;
    public boolean summerTyres;
    private Key key;
    private boolean isRefilled;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        super(country, year);

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            setModel("default");
            ;
        } else {
            setModel(model);
        }

        if (key == null) {
            this.key = new Key();
        } else { this.key = key;}

        if (Double.compare(engineVolume , 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;}
        if ( transmission == null){
            this.transmission = "МКПП";}
        this.typeOfCar = "седан";
        this.carNumber = "х000хх000";
        this.seatsCount = 5;
        this.summerTyres = true;
    }

    @Override
    public void refill(String fuel)  {
        if (fuel.equalsIgnoreCase("Дизель") || fuel.equalsIgnoreCase("Бензин") || fuel.equalsIgnoreCase("Электричество")) {
            System.out.println("Машина заправлена. Топливо: " + fuel);
            isRefilled = true;
        } else {
            System.out.println("Это топлево не походит для машины");
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;}
    }

    public void setCarNumber(String carNumber) {
        if (carNumber == null) {
            this.carNumber = "х000хх000";
        } else {
            this.carNumber = carNumber;}
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectCarNumber() {
        if (carNumber.length() != 9) {
            return false;
        }
        char[] chars = carNumber.toCharArray();
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteRanEngine;
        private final boolean withouKeyAccess;

        public Key(boolean remoteRanEngine, boolean withouKeyAccess) {
            this.remoteRanEngine = remoteRanEngine;
            this.withouKeyAccess = withouKeyAccess;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteRanEngine() {
            return remoteRanEngine;
        }

        public boolean isWithouKeyAccess() {
            return withouKeyAccess;
        }
    }
    public static class  Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this. expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;}
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;}
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void chekExpireDate() {

        }
    }

}

