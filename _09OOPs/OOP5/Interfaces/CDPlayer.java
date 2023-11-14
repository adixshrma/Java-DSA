package _09OOPs.OOP5.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("cd player starts");
    }

    @Override
    public void stop() {
        System.out.println("cd player stops");
    }
}
