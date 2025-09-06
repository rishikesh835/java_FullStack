import java.io.File;
import java.io.IOException;

class FileIO {
    public static void main(String[] args){
        try {
            File file = new File("D:\\learning\\java\\telusko\\16_input_output\\input.txt");
            System.out.println(file.exists());
//            System.out.println(file.createNewFile());
            File dir = new File("D:\\learning\\java\\telusko\\16_input_output\\newDir");
            System.out.println(dir.exists());
            dir.mkdir();

            System.out.println(dir.exists());
            File file1 = new File("D:\\learning\\java\\telusko");


            if(file1.isDirectory()){
                String str[]  = file1.list();
                for(String s : str){
                    System.out.print(s+" ");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}