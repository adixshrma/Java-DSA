package _09OOPs.OOP5.Interfaces;

interface Brake{
    void brake();
}

interface Engine{
    void start();
    void stop();
    void acc();
}
interface Media{
    void start();
    void stop();
}
public class Car implements Brake, Engine, Media{

    @Override
    public void brake() {
        System.out.println("I am Brakes of a car.");
    }

    @Override
    public void start() {
        System.out.println("I Start the car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop the car.");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate the car.");
    }
}
