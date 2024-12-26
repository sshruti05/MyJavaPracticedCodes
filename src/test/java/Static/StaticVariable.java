package Static;

public class StaticVariable {
    static int count = 0;

    StaticVariable(){
        count++;
    }

    public static void main(String[] args) {
        new StaticVariable();
        System.out.println(StaticVariable.count); //1
        new StaticVariable();
        System.out.println(StaticVariable.count); //2
    }
}
