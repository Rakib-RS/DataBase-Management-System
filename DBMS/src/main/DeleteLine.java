package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class DeleteLine {

	public static void main(String[] args) {
		Scanner inw = new Scanner(System.in);
		String s = new String();
		int index;
		System.out.println("Enter a row which want to delete");
		index = inw.nextInt();

		File inputFile = new File("input.txt");
		File inputFiles = new File("output.txt");
		String s2 = new String();
		try {
			Scanner in = new Scanner(inputFile);
			PrintWriter out = new PrintWriter("output.txt");
			String s1 = new String();
			int row = 1, d = 0;
			while (in.hasNextLine()) {
				s1 = in.nextLine();
				if (row!=index) {
					//s1 = s1.replaceAll(",", " ");
					//System.out.println("Word is found in row: " + row);
					//System.out.println(s1);
					out.println(s1);
					d = 1;
				}
				row++;
			}
			if (d == 0)
				System.out.println("Row is not found");
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Scanner ins = new Scanner(inputFiles);
			PrintWriter outs = new PrintWriter("input.txt");
			while (ins.hasNextLine()) {
				s2 = ins.nextLine();
				outs.println(s2);
			}
			ins.close();
			outs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
