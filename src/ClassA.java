public class ClassA {

    public static void main(String[] args) {
        System.out.println("This is the Class A");
        ClassA obj = new ClassA();
        obj.baseMethod("Parameter One");
        System.out.println("Commit 1 feature_branchA");
    }


    public String baseMethod(String parameter1){
        System.out.println("Commit M1 ");
        return parameter1 + " changed";
    }
}
