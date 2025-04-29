import java.util.Scanner;

interface Shape{
	double calculateArea();

}


class Triangle implements Shape{
String title = "Triangle";
	public double calculateArea(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the height");
		double height = sc.nextFloat();
                System.out.println("Write the base");
                double base = sc.nextFloat();
		double area = (0.5 * height * base);
		return area;

				}	
	public String display(){
		return title;
			}

			}

class Rectangle implements Shape{
String title = "Rectangle";
        public double calculateArea(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Write the length");
                double length = sc.nextFloat();
                System.out.println("Write the width");
                double width = sc.nextFloat();
                double area = (length * width);
                return area;

                                }
	public String display(){
                return title;

                        }


                        }


class Circle implements Shape{
String title = "Circle";
        public double calculateArea(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Write the radius");
                double radius = sc.nextFloat();
                double area = (3.14 * (radius * radius));
                return area;

                                }
	public String display(){
                return title;

                        }


                        }


public class Shapes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects you want to add in the shapes?");
		int n = sc.nextInt();
		Shape[] shapes = new Shape[n];
		for(int i = 0; i < n; i++){
			System.out.println("Which shape you want to add in the array?");
			System.out.println("1 for Rectangle, 2 for Triangle and 3 for Circle");
			int choice = sc.nextInt();
			if(choice == 1){
				shapes[i] = new Rectangle();
				double area = shapes[i].calculateArea();
				//String tex1 = shapes[i].display();
				//String text = shapes[i].title;
				System.out.println((i+1) + "Shape type is Rectangle " + "Area is " + area);
					}

			else if(choice == 2){ 
                                shapes[i] = new Triangle();
                                double area = shapes[i].calculateArea();
				System.out.println((i+1) + "Shape type is Triangle " + "Area is " + area);
                                //System.out.println((i+1) + "Shape type is " + shapes[i].display() + "Area is " + area);
                                        }

			if(choice == 3){ 
                                shapes[i] = new Circle();
                                double area = shapes[i].calculateArea();
				System.out.println((i+1) + "Shape type is Circle " + "Area is " + area);
                               //System.out.println((i+1) + "Shape type is " + shapes[i].display() + "Area is " + area);
                                        }






					}
					}


			}
