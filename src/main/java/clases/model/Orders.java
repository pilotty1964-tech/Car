package main.java.clases.model;

public class Orders {
    private final int orderId;
    private String orderName;
    private double price;
    private String date; // Можно использовать java.time.LocalDate для работы с датами
    private int clientId;

    // Конструктор с полными параметрами
    public Orders(int orderId, String orderName, double price, String date, int clientId) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
        this.date = date;
        this.clientId = clientId;
    }

    // Геттеры
    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getClientId() {
        return clientId;
    }

    // Сеттеры
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return String.format("Orders{orderId=%d, orderName='%s', price=%.2f, date='%s', clientId=%d}",
                orderId, orderName, price, date, clientId);
    }
}
