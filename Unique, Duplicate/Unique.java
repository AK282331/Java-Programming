import java.util.Scanner;

public class Unique{
	String[] words = new String[5];
	String[] uniquewords = new String[5];
	int[] repeat = new int[5];
	
	public int checkUnique(String text){
		int counter = 0;
		String wor = text;
		for (int i = 0; i < uniquewords.length; i++){
			
			if (uniquewords[i].equals(wor)){
				counter = counter + 1;
			}
		}
		return counter;
	}
	
	
	public void addWords(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write words which you want to add");
		
		for (int i = 0; i < words.length; i++){
			System.out.println("Write " + (i + 1) + " word");
			words[i] = sc.next();
		}
		
		System.out.println(" Below are the words ");
		for(String word: words){
			System.out.println(word);
		}
	}
	
	public void findUnique(){
		for (int l = 0; l < uniquewords.length; l++){
			uniquewords[l] = " ";
		}
		
		int k = 0;
		for (int j = 0; j <words.length; j++){
			
			int count = checkUnique(words[j]);
			if(count == 0){
				
				uniquewords[k] = words[j];
				k = k + 1;
			}
		}
		
		for (int c = 0; c < uniquewords.length; c++){
			int count = 0;
			for (int d = 0; d < words.length; d++){
				if(uniquewords[c] != " "){
					if(words[d].equals(uniquewords[c])){
						count = count + 1;
					}
				}
			}
			repeat[c] = count;
		}
		
		System.out.println(" Below are the unique words");
		
		for(int p = 0; p <uniquewords.length; p++){
			if(!uniquewords[p].equals(" ")){
				System.out.println(uniquewords[p] + repeat[p]);
			}
		}
		
	}	
	
	
	
	
	
	public static void main(String[] args){
		Unique objUnique = new Unique();
		objUnique.addWords();
		objUnique.findUnique();
	}
	
}