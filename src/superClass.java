
class parent{
    public parent(){
        System.out.println("parent class");
    }
    public parent(int x){
        System.out.println("para parent class");
    }
}
class child extends parent{
    public child(){
        System.out.println("child class");
    }
    public child(int x){
        System.out.println("para child class");
    }
    public child(int x,int y){
        super(x);
        System.out.println("2 para class");
    }
}

public class superClass {
    public static void main(String[] args) {
        child obj = new child();
        child obj1 = new child(3);
        child obj2 = new child(4,5);
    }
}
