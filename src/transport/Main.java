package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car granta = new Car("Lada","Granta",2015,"Россия","желтый",1.7);
        granta.setTransmission("автомат");
        System.out.println( "Марка автомобиля " + granta.getBrand() +
                ", модель " + granta.getModel() +
                ", год выпуска " + granta.getYear() +
                ", сборка в " + granta.getCountry() +
                ", цвет " + granta.getColor() +
                ", обьем двигателя " + granta.engineVolume + " литра " +
                ", коробка передач " + granta.transmission +
                ", тип кузова " + granta.getTypeOfCar() +
                ", номер автомобиля " + granta.carNumber +
                ", колличество мест " + granta.getSeatsCount() +
                ", тип шин: " + (granta.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черный",3.0);
        audi.setSummerTyres(false);
        System.out.println( "Марка автомобиля " + audi.getBrand() +
                ", модель " + audi.getModel() +
                ", год выпуска " + audi.getYear() +
                ", сборка в " + audi.getCountry() +
                ", цвет " + audi.getColor() +
                ", обьем двигателя " + audi.engineVolume + " литра " +
                ", коробка передач " + audi.transmission +
                ", тип кузова " + audi.getTypeOfCar() +
                ", номер автомобиля " + audi.carNumber +
                ", колличество мест " + audi.getSeatsCount() +
                ", тип шин: " + (audi.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car bmw = new Car("BMW","Z8",2021,"Германии","черный",3.0);

        System.out.println( "Марка автомобиля " + bmw.getBrand() +
                ", модель " + bmw.getModel() +
                ", год выпуска " + bmw.getYear() +
                ", сборка в " + bmw.getCountry() +
                ", цвет " + bmw.getColor() +
                ", обьем двигателя " + bmw.engineVolume + " литра " +
                ", коробка передач " + audi.transmission +
                ", тип кузова " + audi.getTypeOfCar() +
                ", номер автомобиля " + audi.carNumber +
                ", колличество мест " + audi.getSeatsCount() +
                ", тип шин: " + (bmw.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красный",2.4);

        System.out.println( "Марка автомобиля " + kia.getBrand() +
                ", модель " + kia.getModel() +
                ", год выпуска " + kia.getYear() +
                ", сборка в " + kia.getCountry() +
                ", цвет " + kia.getColor() +
                ", обьем двигателя " + kia.engineVolume + " литра " +
                ", коробка передач " + kia.transmission +
                ", тип кузова " + kia.getTypeOfCar() +
                ", номер автомобиля " + kia.carNumber +
                ", колличество мест " + kia.getSeatsCount() +
                ", тип шин: " + (kia.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car hyndai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевый",1.6);

        System.out.println( "Марка автомобиля " + hyndai.getBrand() +
                ", модель " + hyndai.getModel() +
                ", год выпуска " + hyndai.getYear() +
                ", сборка в " + hyndai.getCountry() +
                ", цвет " + hyndai.getColor() +
                ", обьем двигателя " + hyndai.engineVolume + " литра " +
                ", коробка передач " + hyndai.transmission +
                ", тип кузова " + hyndai.getTypeOfCar() +
                ", номер автомобиля " + hyndai.carNumber +
                ", колличество мест " + hyndai.getSeatsCount() +
                ", тип шин: " + (hyndai.isSummerTyres() ? "летняя" : "зимняя") + " резина");
        hyndai.setCarNumber("r667j434");
        System.out.println("номер: " + hyndai.isCorrectCarNumber());
        System.out.println();


        Train lastochka = new Train(3500,8,"Белорусский вокзал", "Минск-пассажирский", 11,
                "Ласточка","В-901",2011,"Россия","Красный",301);
        System.out.println("Марка поезда " +lastochka.getBrand() + ", модель " + lastochka.getModel() + " , год выпуска " + lastochka.getYear() + " , страна " +
                lastochka.getCountry() + " , скорость " + lastochka.getMaxSpeed() + ", станция отправления " + lastochka.getDepartureStation() + ", станция прибытия " +
                lastochka.getArrivalStation() + ". цена " + lastochka.getTripPrice() + " колличество вагонов " + lastochka.getNumberOfWagons());



        Train leningrad = new Train(1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8,
                "Ленинград", "D-125", 2019,"Россия", null,270);

        System.out.println("Марка поезда " + leningrad.getBrand() + ", модель " + leningrad.getModel() + " , год выпуска " + leningrad.getYear() + " , страна " +
                leningrad.getCountry() + " , скорость " + leningrad.getMaxSpeed() + ", станция отправления " + leningrad.getDepartureStation() + ", станция прибытия " +
                leningrad.getArrivalStation() + ". цена " + leningrad.getTripPrice() + " колличество вагонов " + leningrad.getNumberOfWagons());
        System.out.println();


        Bus ikarus = new Bus("ikarus","HA - 241",2020,"Hungary","Blue",210);
        System.out.println("Марка автобуса " + ikarus.getBrand() + ", модель " + ikarus.getModel() + " , год выпуска " + ikarus.getYear() + " , страна " +
                ikarus.getCountry() +  ", цвет " + ikarus.getColor() + " , скорость " + ikarus.getMaxSpeed() );

        Bus fav = new Bus("fav", "BQ -7", 2021, "China", "white",190);
        System.out.println("Марка автобуса " + fav.getBrand() + ", модель " + fav.getModel() + " , год выпуска " + fav.getYear() + " , страна " +
                fav.getCountry() +  ", цвет " + fav.getColor() + " , скорость " + fav.getMaxSpeed() );

        Bus Skyline = new Bus("Skyline","Dōngfēng-41",2019,"China","white",240);
        System.out.println("Марка автобуса " + Skyline.getBrand() + ", модель " + Skyline.getModel() + " , год выпуска " + Skyline.getYear() + " , страна " +
                Skyline.getCountry() +  ", цвет " + Skyline.getColor() + " , скорость " + Skyline.getMaxSpeed() );


    }
}