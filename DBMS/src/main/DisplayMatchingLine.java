package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DisplayMatchingLine {

	public static void main(String[] args) {
		Scanner inw = new Scanner(System.in);
		String s= new String();
		System.out.println("Enter a word");
		s=inw.nextLine();
		
		File inputFile = new File("input.txt");
		try {
			Scanner in = new Scanner(inputFile);
			PrintWriter out = new PrintWriter("output.txt");
			String s1 = new String();
			String s2 = new String();
			int row =1,d=0;
			while(in.hasNextLine()) {
				s1 = in.nextLine();
				if(s1.contains(s)) {
					//s1=s1.replaceAll(",", " ");
					System.out.println("Word is found in row: "+row);
					System.out.println(s1);
					out.println(s1);
					d=1;
				}
				row++;
			}
			if(d==0)
				System.out.println("word is not found");
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
