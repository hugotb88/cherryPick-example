public class ClassA {

    public static void main(String[] args) {
        System.out.println("This is the Class A");
        ClassA obj = new ClassA();
        obj.baseMethod("Parameter One");
    }


    public String baseMethod(String parameter1){
        return parameter1 + " changed";
    }
}
