import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadBuffered
{
    public static void main(String args[]) throws IOException{
        String input = "D:\\learning\\java\\telusko\\16_input_output\\input.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            File file = new File(input);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String str = br.readLine();
            while(str != null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            br.close();
            fr.close();
        }
    }
}
