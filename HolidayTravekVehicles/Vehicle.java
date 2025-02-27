// Vehicle class
class Vehicle {
    private final String serialNumber;
    private final String name;
    private final String model;
    private final int year;
    private final String manufacturer;
    private final double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void createNewVehicleRecord() {
        System.out.println("New vehicle record created: " + name + " (" + year + ")");
    }

    @Override
    public String toString() {
        return "Vehicle [Serial No: " + serialNumber + ", Name: " + name + ", Model: " + model + 
               ", Year: " + year + ", Manufacturer: " + manufacturer + ", Base Cost: $" + baseCost + "]";
    }
}