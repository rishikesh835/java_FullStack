import java.io.*;

public class Deserialisation
{
    public static void main(String[] args) throws IOException{
//        File file = new File("D:\\learning\\java\\telusko\\16_input_output\\serial.txt");
        String path = "D:\\learning\\java\\telusko\\16_input_output\\serial.txt";
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        try{
             fis = new FileInputStream(path);
             bis = new BufferedInputStream(fis);
             ois = new ObjectInputStream(bis);

             Student stu = (Student) ois.readObject();
             stu.display();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            ois.close();
            fis.close();

        }
    }
}
