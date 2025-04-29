import java.util.Scanner;

//Creating abstract class of Vehicle 
abstract class Vehicle{
	final String VehicleId; //Creating variable which will store the vehicle id and it is constant
	int Capacity; //Variable hold the total capacity of the vehicle
	int base_rate_per_km; //base rate per km

	//Constructer to initialise the instance variables which can se accessed by the functions in the class
	Vehicle(String id, int capacity, int base_rate){
			this.VehicleId = id;
			this.Capacity = capacity;
			this.base_rate_per_km = base_rate;

					}
	//Creating abstract calculate fare method which can be written by the subclass.
	abstract void calculate_fare(float distance);

	//Function to display the details of the vehicle and can't be overridden
	final void display_details(){
		System.out.println("Vehicle ID: " + VehicleId + "\nCapacity: " + Capacity);

				}


			}


//Creating Car Class which is inheriting the attributes and methods of Vehicle Class
class Car extends Vehicle{
	String Color; //Attribute of Car class tell about the color
	String Brandname; //Attribute of Car class tell us about the brand name
	
	//Constructer to initialise the instance variables of car class and also vehicle class which can se accessed by the 
	//functions in the class.
	Car(String id, int capacity, int base_rate, String Color, String name){
		super(id,capacity,base_rate);
		this.Color = Color;
		this.Brandname = name;

					}
	//Creatinng the logic of the calculate fare function
	void calculate_fare(float distance){
		System.out.println("The total fare is " + distance + " * " + base_rate_per_km + " = " + (distance * base_rate_per_km)); 

					}
	//Function which will display the details of the car and also accessing the details from the 
	//vehicle class
	void car_display_details(){
		super.display_details();
		System.out.println("Color :" + Color + "\nBrand name: " + Brandname);
					}
			}

class Bike extends Vehicle{
	String Color;
	String Brandname;
	Bike(String id, int capacity, int base_rate, String Color, String name){
                super(id,capacity,base_rate);
                this.Color = Color;
                this.Brandname = name;

                                        }

        void calculate_fare(float distance){
                System.out.println("The total fare is " + distance + " * " + base_rate_per_km + " = " + (distance * base_rate_per_km));

                                        }
        void bike_display_details(){
                super.display_details();
                System.out.println("Color :" + Color + "\nBrand name: " + Brandname);
                                        }

			}


public class Ride{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car objCar = new Car("M001", 4, 10, "Black", "Maruti");
	Bike objBike = new Bike("B001",2,7,"Red", "Yamaha");
	System.out.println("Do you want to travel by car or by bike?" + "\n1 for car." + "\n2 for bike");
	int travel = sc.nextInt();
	if(travel == 1){
			System.out.println("Do you want to calculate fare or See the details of the car?");
			System.out.println("1 for fare and 2 for details");
       			int choice = sc.nextInt();
       			if(choice == 1){
               			 System.out.println("What is the distance you want to travel?");
               			 float distance = sc.nextFloat();
               			 objCar.calculate_fare(distance);
					 }

       			else if (choice == 2){
               			 objCar.car_display_details();

                                 	       }
			else{
				System.out.println("Write correct number");
				}
			}
	else if(travel == 2){
			System.out.println("Do you want to calculate fare or See the details of the bike?");
                        System.out.println("1 for fare and 2 for details");
                        int choice = sc.nextInt();
                        if(choice == 1){
                                 System.out.println("What is the distance you want to travel?");
                                 float distance = sc.nextFloat();
                                 objBike.calculate_fare(distance);
                                         }

                        else if (choice == 2){
                                 objBike.bike_display_details();

                                               }
                        else{
                                System.out.println("Write correct number");
                                }
                        }
		}
}


