public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999999997L;
        intVal = (int)longVal;
        System.out.println(intVal);

        float floatVal = 11.32f;
        double  doubleVal = 3344556.789;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);

        int a = 65;
        char b = (char)a;
        System.out.println(b);
    }
}
