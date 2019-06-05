public class AutoConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal1 = intVal ;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.23f;
        double doubleVal1 = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);

        doubleVal1 = longVal1;
        doubleVal1 = intVal;

        floatVal = intVal;
        floatVal = longVal1;

        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch +10;
        System.out.println(ch);
        System.out.println(chNum);

    }
}
