import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeIO {
    public static void main(String[] args) throws IOException {
        String input = "D:\\learning\\java\\telusko\\16_input_output\\input.txt";
        FileWriter fw = null;
        try{
            File file = new File(input);
            fw = new FileWriter(file,true);
            fw.write("java");
            fw.write("\n");
            fw.write(65);
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            char ch[] = {'R','I','S','H','I','K','E','S','H'};
            fw.write(ch);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            fw.close();
        }
    }
}
