import java.util.Scanner;
public class VehicleManager {
    Scanner input = new Scanner(System.in);

    public void Run()
    {
        //Car ARRAY
        Car carGarage [] = new Car[3];
        //Car Object
        Car oCar1 = new Car();
        //giving object attributes.
        oCar1.colorC = "Red";
        oCar1.running = false;
        //placing object at index 0 of array
        carGarage[0] = oCar1;

        Car oCar2 = new Car();
        oCar2.colorC = "Gold";
        oCar2.running = false;
        carGarage[1] = oCar2;

        Car oCar3 = new Car();
        oCar3.colorC = "Blue";
        oCar3.running = false;
        carGarage[2] = oCar3;

        //Motorcycle Array
        MotorCycle motorGarage [] = new MotorCycle[3];
        //Motorcycle object
        MotorCycle oMotorC1 = new MotorCycle();
        oMotorC1.colorMC = "Orange";
        oMotorC1.running = false;
        motorGarage[0] = oMotorC1;

        MotorCycle oMotorC2 = new MotorCycle();
        oMotorC2.colorMC = "Green";
        oMotorC2.running = false;
        motorGarage[1] = oMotorC2;

        MotorCycle oMotorC3 = new MotorCycle();
        oMotorC3.colorMC = "White";
        oMotorC3.running = false;
        motorGarage[2] = oMotorC3;

        int choice = 8;
        char choice2 = 'z';
        do {

            System.out.println("\nWelcome to the Garage");

            System.out.printf("\nLot 1 : Mustang GT color: " + oCar1.colorC);

            System.out.printf("\nLot 2 : Nissan 370z color: " + oCar2.colorC);

            System.out.printf("\nLot 3 : Tesla Roadster color: " + oCar3.colorC);

            System.out.printf("\nLot 4 : Harley-Davidson low rider S color: " + oMotorC1.colorMC);

            System.out.printf("\nLot 5 : KTM 390 DUKE  color: " + oMotorC2.colorMC);

            System.out.printf("\nLot 6 : Yamaha XSR 900  color: " + oMotorC3.colorMC);

            System.out.println("\n............................................................");

            //Timer Delay next line
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\nPlease choose a Lot to start a vehicle.\n");
            System.out.println("To leave the garage please choose 8");
            System.out.println("To List vehicle status choose 7");
            choice = input.nextInt();
            //Car Menu
            if(choice == 1)
            {
                System.out.printf("You chose Lot 1 : Mustang...\n");
                oCar1.Start(null);


            }
            if(choice2 == 'm')
            {
                oCar1.Stop(null);
            }


            if(choice == 2)
            {
                System.out.printf("You chose Lot 2 : Nissan...\n");
                oCar2.Start(null);

            }
            if(choice2 == 'n')
            {
                oCar2.Stop(null);
            }
            if(choice == 3)
            {
                System.out.printf("You chose Lot 3 : Tesla...\n");
                oCar3.Start(null);
            }
            if(choice2 == 't')
            {
                oCar3.Stop(null);
            }

            //MotorCycle Menu
            if(choice == 4)
            {
                System.out.printf("You chose Lot 4 : Harley...\n");
                oMotorC1.Start(null);

            }
            if(choice2 == 'h')
            {
                oMotorC1.Stop(null);
            }

            if(choice == 5)
            {
                System.out.printf("You chose Lot 5 : KTM...\n");
                oMotorC2.Start(null);

            }
            if(choice2 == 'k')
            {
                oMotorC2.Stop(null);
            }

            if(choice == 6)
            {
                System.out.printf("You chose Lot 6 : Yamaha...\n");
                oMotorC3.Start(null);


            }
            if(choice2 == 'y')
            {
                oMotorC3.Stop(null);
            }
            if(choice == 7)
            {
                boolean car1R = oCar1.running;
                System.out.println("Lot 1 : "+ car1R);
                boolean car2R = oCar2.running;
                System.out.println("Lot 2 : "+ car2R);
                boolean car3R = oCar3.running;
                System.out.println("Lot 3 : "+ car3R);

                boolean motorR1 = oMotorC1.running;
                System.out.println("Lot 4 : "+ motorR1);
                boolean motorR2 = oMotorC2.running;
                System.out.println("Lot 5 : "+ motorR2);
                boolean motorR3 = oMotorC3.running;
                System.out.println("Lot 1 : "+ motorR3);
            }

            System.out.println("\nTo stop a vehicle type in the first letter (lowercase) of the vehicle.");
            System.out.println("Or to return to the previous menu choose 'r' ");
            choice2 = input.next().charAt(0);
            if(choice2 == 'r')
            {
               continue;
            }
        }while(choice != 8);




    /*
    *REFERENCE EXAMPLE*
    car redCar = new Car("Red");
    car Garage [] = new Car [100];
    Garage[0] = redCar;

    ///
    boolean bResult = oEngine.Start("INT", 43);
    System.out.println("Result : "+ bResult);


    */





    }
}
