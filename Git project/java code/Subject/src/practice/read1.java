package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("temp.txt"));
        System.out.print(input.nextLine());
    }
}
