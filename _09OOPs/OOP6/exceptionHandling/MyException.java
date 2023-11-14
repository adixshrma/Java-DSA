package _09OOPs.OOP6.exceptionHandling;

public class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
class Run{
    public static void main(String[] args) {
        String name = "Aditya";
        try{
            if(name.equals("Aditya")){
                throw new MyException("calling your name");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}