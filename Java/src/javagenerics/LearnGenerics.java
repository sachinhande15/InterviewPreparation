package javagenerics;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class LearnGenerics {

	public static void main (String[] args) {

	}

	public static <T> void fileCreated(T data) {
		File file = new File("sachin.txt");
		try (FileWriter fileWriter = new FileWriter(file, false)){
			fileWriter.write(data.toString());
			System.out.println("File created and data is written inside the file and File name is "+file.getName());
			System.out.println("The thread name is "+Thread.currentThread().getName());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void fileRead(File file){

		try (BufferedReader fileReader = new BufferedReader(new FileReader(file))){
			System.out.println(fileReader.read());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
