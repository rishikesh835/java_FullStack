import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterBuffered
{
    public static void main(String args[]) throws IOException{
        String input = "D:\\learning\\java\\telusko\\16_input_output\\input.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            File file = new File(input);
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);

            bw.write("Alien");
            bw.newLine();
            bw.write(66);
            bw.newLine();
            char ch[] = {'a','b','c','d'};
            bw.write(ch);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            bw.close();
//            fw.close();
        }
    }
}
