package _09OOPs.OOP5.Interfaces;

public class GasEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Gas Engine Starts.");
    }

    @Override
    public void stop() {
        System.out.println("Gas Engine Stops.");
    }

    @Override
    public void acc() {
        System.out.println("Gas Engine Accelerates.");
    }
}
