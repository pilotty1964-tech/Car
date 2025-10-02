package main.java.clases.model;

public class Cars {
    private final int carId;
    private String brand;
    private String model;
    private String licensePlate; // Исправил на String, так как номер может содержать буквы
    private int year;
    private int orderId; // Изменил на int, так как это внешний ключ

    // Конструктор с полными параметрами
    public Cars(int carId, String brand, String model, String licensePlate, int year, int orderId) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
        this.orderId = orderId;
    }

    // Геттеры
    public int getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public int getOrderId() {
        return orderId;
    }

    // Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return String.format("Cars{carId=%d, brand='%s', model='%s', licensePlate='%s', year=%d, orderId=%d}",
                carId, brand, model, licensePlate, year, orderId);
    }
}