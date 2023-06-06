class Vehicle215 {
    private int passengers;
    private double fuelTankCapacity;
    private double fuelConsumption;
    private String type;

    public Vehicle215(String type, int passengers, double fuelTankCapacity, double fuelConsumption) {
        this.type = type;
        this.passengers = passengers;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double calculateRange() {
        return (fuelTankCapacity / fuelConsumption) * 100;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String range() {
        double range = calculateRange();
        return String.format("%.2f", range);
    }

    public String getDescription() {
        return "Pojazd " + type + " przewozi " + passengers + " osób na odległość " + range() + " km.";
    }

    public double calculateFuelRequired(double distance) {
        return (fuelConsumption / 100) * distance;
    }
}
