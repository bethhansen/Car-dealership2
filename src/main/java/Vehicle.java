/**
 * Created by Guest on 8/2/17.
 */
public class Vehicle { //class Vehicle must be in UpperCamelCase
    public int year;  // these are all attributes of the vehicle they also can be refered to property
    public String brand;
    public String model;
    public int miles;
    public int price;



    public boolean worthBuying(int maxPrice) {  //this is a method (worthBuying) we call upon class Vehicle that will return our answer
        return (price < maxPrice);
    }
}