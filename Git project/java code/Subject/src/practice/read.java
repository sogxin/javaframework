package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class read {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\aaa.doc");
        RandomAccessFile ran = new RandomAccessFile(file,"rw");
        try {
            ran.writeBytes("aaa");
        }catch(IOException e){
            e.printStackTrace();
        }
        Scanner input = new Scanner(new File("D:\\aaa.doc"));
        System.out.print(input.nextLine());
    }
}
