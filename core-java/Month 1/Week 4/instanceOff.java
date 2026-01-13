class Person0 {

}

class Student0 extends Person0 {

}

//class Teacher0 extends Student0 {
//}

public class instanceOff {
    public static void main(String[] args) {
        Person0 p = new Student0();
        System.out.println(p);
        //System.out.println(p instanceof Person0);
        //System.out.println(p instanceof Student0);
        //System.out.println(p instanceof Teacher0);
    }
}
