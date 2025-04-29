import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



class PurchaseDetails{
	String filename;
	String[] arrItem;
	int[] arrQty;
	int[] arrUnitPrice;

	PurchaseDetails(String fname, int fsize){
		this.filename = fname;
		this.arrItem = new String[fsize];
		this.arrQty = new int[fsize];
		this.arrUnitPrice = new int[fsize];
			}

	void readFile() throws IOException, ArithmeticException {
		File objfile = new File(filename);
		Scanner reader = new Scanner(objfile);
		int counter = 0;
		while(reader.hasNextLine()){
			String data = reader.nextLine();
			String[] parsedata = data.split(",");
			if(parsedata[0].length() <=7){
				arrItem[counter] = parsedata[0];
				arrQty[counter] = Integer.parseInt(parsedata[1]);
				arrUnitPrice[counter] = Integer.parseInt(parsedata[2]);
				counter += 1;

			}
			else{
			throw new ArithmeticException("Length should be les than 7");
					}
					}

					
}

		}


public class Bill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the File name");
                String fname = sc.next();
                PurchaseDetails objPurchase = new PurchaseDetails(fname,6);

		while(true){
		System.out.println("1-Enter Items" + "\n2-Create Bill" + "\n3-Display bill" + "\n4-Exit");
		int choice = sc.nextInt();

		if(choice == 1){
                	try{
                        	objPurchase.readFile();
				for(int i = 0; i < 6; i++){
					System.out.println(objPurchase.arrItem[i]);
						}
				System.out.println("Data Loaded Successfully");

                        }
                	catch(IOException e){
                        	System.out.println(e.getMessage());
                                }
			catch(ArithmeticException a){
				System.out.println(a.getMessage());
					}

				}
		else if(choice == 2){
				
				System.out.println("Write the bill file name");
				String filename = sc.next();
				try{
					File billfile = new File(filename);
                                	billfile.createNewFile();
                                	FileWriter writer = new FileWriter(filename,true);
                                	for(int i = 0; i < 5; i++){
                                        	writer.write(objPurchase.arrItem[i] + " " + (objPurchase.arrQty[i] *  objPurchase.arrUnitPrice[i]) + "\n");

                                                        }
                                        	writer.close();
                                        	}
					Systenm.out.println("Data Written Successfullly");

					
				catch(IOException e){
					System.out.println(e.getMessage());
							}
					}
		else if(choice == 3){
			try{
			File objbill = new File("bill.txt");
			Scanner reader = new Scanner(objbill);
			while(reader.hasNextLine()){
				System.out.println(reader.nextLine());
					}
			}
			catch(IOException e){
				System.out.println(e.getMessage());

						}


						}
		else if(choice == 4){
			break;
					}
			}
			}

		}
