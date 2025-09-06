import java.io.*;

class Student implements Serializable {

    int id;
    String name;
    int age;

    public Student(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Serialisation {
    public static void main(String[] args) throws Exception {
        Student stu = new Student(1,"John Smith", 20);
        stu.display();
        String path = "D:\\learning\\java\\telusko\\16_input_output\\serial.txt";
//        File file = new File(path);
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
             fos = new FileOutputStream(path);
             bos = new BufferedOutputStream(fos);
             oos = new ObjectOutputStream(bos);

            oos.writeObject(stu);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            oos.close();
            bos.close();
            fos.close();
        }
    }
}
