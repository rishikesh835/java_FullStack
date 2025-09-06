class A{
    public void show1(){
        System.out.println("in A");
    }
    
}
class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}
public class TypeCasting {
    public static void main(String args[]){
        A obj =(A) new B(); //implicit
        obj.show1();
        B objB = (B)obj;
        objB.show2();
    }
}
