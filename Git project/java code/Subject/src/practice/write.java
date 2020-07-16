package practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class write {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("temp.txt");
        output.print("java 101");
        output.close();
    }

}
