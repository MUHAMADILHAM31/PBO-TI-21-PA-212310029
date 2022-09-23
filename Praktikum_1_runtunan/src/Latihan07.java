import java.util.Scanner;
public class Latihan07 {

	public static void main(String[] args) {
		String data = "Muhamadilaham";
		 
        data = data.replaceAll("[a,i,u,e,o]", "X");
 
        System.out.println(data);
	}

}