package L6Class;

class Vehicle {
    int num_of_passengers;
    int fuel_cap;
    int mpg;
}

class VehicleDemo
{
    public static void main (String [] args) throws Exception{
        Vehicle minivan = new Vehicle ();

        minivan.num_of_passengers = 9;
        minivan.fuel_cap = 16;
        minivan.mpg = 21;

        int range = minivan.fuel_cap * minivan.mpg;
        System.out.printf("Minivan can carry %d with a range of %d\n",
                                            minivan.num_of_passengers,
                                            range);
    }
}
