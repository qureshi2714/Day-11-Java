
abstract interface maths {
    void print();
}
class d implements maths{
    public void print(){
        System.out.println("hello");
    }
}
public class Abstractinterface{
    public static void main(String[] args){
        d f=new d();
        f.print();
    }
    
}
