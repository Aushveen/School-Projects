public class Car {
    private double efficiency, fuel;

    public Car(double efficiency){
        this.efficiency = efficiency;
        this.fuel = 0;
    }

    public void drive(double distance){
        this.fuel = this.fuel - (distance / this.efficiency);
    }
    public double getGasInTank(){
        return this.fuel;
    }
    public void addGas(double fuel){
        this.fuel = this.fuel + fuel;
    }
}
