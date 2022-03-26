package Review;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {


    public static void main(String[] args) throws IOException {

        String filePath = "/Users/kamol/Desktop/Trasformers 2022/java2022/Trasformers/src/Review/browser.txt";
        String value = fileReader(filePath);
        System.out.println(value);
    }


    public static  String  fileReader(String path) throws IOException {

        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        char [] charArr = new char[ (int) file.length()];
        fileReader.read(charArr);

        String fileContent = new String(charArr);

        return fileContent;
    }
}
