package _09OOPs.OOP5.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CDPlayer();
    public NiceCar(){
        engine = new GasEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

}
