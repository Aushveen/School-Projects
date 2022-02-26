public class CarTest {
    public static void main(String[] args){
        Car billy = new Car(500);
        billy.addGas(50);
        billy.drive(1);
        billy.addGas(22);
        billy.drive(111);

        Double gas = billy.getGasInTank();
        System.out.println("the expected amount of gas is: " + "71.776");
        System.out.println("the actual amount of gas is: " + gas);

    }
}
