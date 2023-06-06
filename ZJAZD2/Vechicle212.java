class Vehicle212 {
    private int passengers;
    private double fuelTankCapacity;
    private double fuelConsumption;

    public Vehicle212 (int passengers, double fuelTankCapacity, double fuelConsumption) {
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

    public void range() {
        double range = calculateRange();
        System.out.println("Zasięg pojazdu: " + range + " km");
    }
}
