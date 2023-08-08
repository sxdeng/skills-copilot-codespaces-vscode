
public class JavaCoPilot {

    public static void main(String[] args) {
        System.out.println(new JavaCoPilot().isTen(10));
    }

    private boolean isTen(int a) {
        return a == 10;
    }

    @Override
    public String toString() {
        return "JavaCoPilot []";
    }
}