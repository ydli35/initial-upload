import java.io.*;

public class HelloWorld {
	public static void main(String[] args) {
		File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

		System.out.println("Hello world!");
	}
}