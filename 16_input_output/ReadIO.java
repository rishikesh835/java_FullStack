import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadIO {
    public static void main(String[] args) throws IOException {
        String input = "D:\\learning\\java\\telusko\\16_input_output\\input.txt";
        FileReader fr = null;
        try{
            File file = new File(input);
             fr = new FileReader(file);

             char []ch = new char[(int)file.length()];
             fr.read(ch);
            System.out.println(ch);


//             int d = fr.read();
//            while(d != -1){
//                System.out.println((char)d);
//                d = fr.read();
//
//            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            fr.close();
        }
    }
}
