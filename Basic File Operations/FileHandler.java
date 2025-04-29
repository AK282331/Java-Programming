import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Creating a blank file
		try{
			File objFile = new File("Sample.txt");
			objFile.createNewFile();
			}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			}

		//Writing the data in the blank file
		try{
			FileWriter writer = new FileWriter("Sample.txt");
			writer.write("Writing Line 1");
			writer.close();
			}

		catch(IOException e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                        }

		//Appending the data into Sample File
		 try{
			FileWriter writer = new FileWriter("Sample.txt",true);
			System.out.println("How many lines you want to add");
			int line = sc.nextInt();
			for(int i = 1; i <= line; i++){
				System.out.println("Add the text of line number " + i);
			
				String text = sc.nextLine();
				
				writer.write(text + "\n");
							}
			writer.close();
			}

		catch(IOException e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                        } 

		//Reading the data of the Sample file
		try{
			File objFile = new File("Sample.txt");
			Scanner reader = new Scanner(objFile);
			while(reader.hasNextLine()){
					String data = reader.nextLine();
		                        System.out.println(data);

							}
			
			}

		catch(IOException e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                        }


						}



			}
