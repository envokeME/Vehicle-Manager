public class Car extends MotorVehicle implements Engine {
    String colorC;
    public boolean Start(String colorC)
    {
        System.out.printf("\nThe Car is running.", colorC);
        return running = true;

    }
    public boolean Stop(String colorC){
        System.out.printf("\nThe Car is turned off.", colorC);
        return running = false;
    }


}
