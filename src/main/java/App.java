/**
 * Created by Guest on 8/2/17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your maximum budget for a vehicle?");

    try {
        String stringUserMaxBudget = bufferedReader.readLine();

        Vehicle hatchback = new Vehicle();//the following objects are the instances of the class (instantiation)
        hatchback.year = 1994; //each vehicle needs a variable name.
        hatchback.brand = "Subaru";
        hatchback.model = "Legacy";//Find the object stored in the variable hatchback
        hatchback.miles = 170000;
        hatchback.price = 4000;

        Vehicle suv = new Vehicle();
        suv.year = 2002;//each vehicle needs a variable name.
        suv.brand = "Ford";//Find the object stored in the variable suv
        suv.model = "Explorer";
        suv.miles = 100000;
        suv.price = 7000;

        Vehicle sedan = new Vehicle();
        sedan.year = 2015;//each vehicle needs a variable name.
        sedan.brand = "Toyota";//Find the object stored in the variable sedan
        sedan.model = "Camry";
        sedan.miles = 50000;
        sedan.price = 30000;

        Vehicle truck = new Vehicle();
        truck.year = 1999;//each vehicle needs a variable name.
        truck.brand = "Ford";//Find the object stored in the variable truck
        truck.model = "Ranger";
        truck.miles = 100000;
        truck.price = 4000;


        Vehicle[] allVehicles = {hatchback, suv, sedan, truck};//storing all vehicles in and array

        int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

        System.out.println("Alright, here's what we have in your price range:");

        for (Vehicle individualVehicle : allVehicles) {
            if (individualVehicle.worthBuying(userMaxBudget)) {
                System.out.println("----------------------");
                System.out.println(individualVehicle.year);
                System.out.println(individualVehicle.brand);
                System.out.println(individualVehicle.model);
                System.out.println(individualVehicle.miles);
                System.out.println(individualVehicle.price);
            }
        }
    }
       catch(IOException e)
    {
        e.printStackTrace();
    }
}

}



