import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTextCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr= new FileReader("D:\\codegym\\Exercise-java\\exception\\text1.txt");
            fw = new FileWriter("D:\\codegym\\Exercise-java\\exception\\text3.txt");
            int charter;
            while ((charter = fr.read())!=-1){
                fw.write(charter);
            }
            fr.close();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
