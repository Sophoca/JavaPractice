package Lab9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test
{
    public static FileInputStream M1(File fileName) throws FileNotFoundException {
        FileInputStream fis2 = new FileInputStream(fileName);
        System.out.println("M1: File input stream created");
        return fis2;
    }

    public static void main(String args[])
    {
        FileInputStream fis1 = null;
        // It can be changed, becuase I used absoloute path
        String fileName = "C:\\Java_Study\\Java_Practice\\src\\Lab9\\foo.bar";
        File file=new File(fileName);
        System.out.println("main: Starting " + Test.class.getName()
                + " with file name = " + fileName);

        try {
            fis1 = M1(file);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("main: " + Test.class.getName() + " ended");
        }
    }
}
