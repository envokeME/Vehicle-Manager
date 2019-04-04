public class MotorCycle extends MotorVehicle implements Engine {
 String colorMC;
    public boolean Start(String colorMC)
    {
        System.out.printf("\nThe Motorcycle is running.", colorMC);
        return running = true;
    }
    public boolean Stop(String colorMC)
    {
        System.out.printf("\nThe Motorcycle is turned off.", colorMC);
        return running = false;
    }




}
