class Vehicle {
    private int passengers;
    private double fuelTankCapacity;
    private double fuelConsumption;

    public Vehicle(int passengers, double fuelTankCapacity, double fuelConsumption) {
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

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
