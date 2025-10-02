package main.java.clases.model;

public class Clients {
    private final int clientId;
    private String fullName;
    private String licenseNumber;
    private String phoneNumber;

    // Конструктор с полными параметрами
    public Clients(int clientId, String fullName, String licenseNumber, String phoneNumber) {
        this.clientId = clientId;
        this.fullName = fullName;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
    }

    // Геттеры
    public int getClientId() {
        return clientId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Сеттеры
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Clients{clientId=%d, fullName='%s', licenseNumber='%s', phoneNumber='%s'}",
                clientId, fullName, licenseNumber, phoneNumber);
    }
}
