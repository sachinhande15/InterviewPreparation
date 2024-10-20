package filehandling;

import java.io.*;
import java.util.Random;
import java.util.SortedMap;

public class FileHelper {

	public static String writeFile(String data){

		File file = new File("OutputResult/"+fileNameGenerator()+".txt");

		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))){
			bf.write(data);
			bf.newLine();
			System.out.println("Data has been written inside the File successfully");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return file.getAbsolutePath();
	}

	public static void readFile(File file){
		if( !file.exists() ){
			System.out.println("File not exists");
			return;
		}
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			System.out.println("Thread name is "+Thread.currentThread().getName());
			bufferedReader.lines()
					.map(String::toUpperCase)
					.forEach(System.out::println);
		}catch (Exception e){
			System.out.println("Error Occurred while reading the file"+ e.getMessage());
		}
	}

	public static String fileNameGenerator(){
		Random r = new Random();
		String number = String.valueOf(1000+r.nextInt(9000));
		return "sachin".concat(number);
	}
}
