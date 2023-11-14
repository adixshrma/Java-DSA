package _09OOPs.OOP5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car obj = new Car();
//        obj.brake();
//        obj.acc();
//        obj.start();
//        obj.stop();
//
//        Media obj1 = new Car();
//        obj1.stop();

        NiceCar car = new NiceCar();        // by default, it has gas engine.
        car.start();
        car.startMusic();
        System.out.println();

        ElectricEngine obj1 = new ElectricEngine();
        NiceCar obj2 = new NiceCar(obj1);           // we provided it an electric engine.
        obj2.start();
        obj2.stop();
        obj2.acc();
        obj2.startMusic();
        obj2.stopMusic();
        System.out.println();

        GasEngine obj3 = new GasEngine();
        obj2.upgradeEngine(obj3);           // we change the engine again to gas.
        obj2.start();
    }
}
