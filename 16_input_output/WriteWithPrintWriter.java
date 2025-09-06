import java.io.*;

public class WriteWithPrintWriter {
    int data = 10;
    String name = "Rishikesh";
    public static void main(String[] args) throws IOException {
        String input = "D:\\learning\\java\\telusko\\16_input_output\\input.txt";
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
            File file = new File(input);
            fw = new FileWriter(file);
            pw = new PrintWriter(fw);

            pw.write(65);
            pw.println(75);
            pw.println("java");
            pw.println(true);
            WriteWithPrintWriter ww = new WriteWithPrintWriter();
            pw.println(ww); //writes the output of toString method in the file
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            pw.close();
            fw.close();
        }
    }
}
