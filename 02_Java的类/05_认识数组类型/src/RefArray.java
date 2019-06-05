public class RefArray {
    public static void main(String[] args) {
        Merchandise[] merchandise =new Merchandise[9];
        merchandise[0]=new Merchandise();
        merchandise[1]=new Merchandise();
        merchandise[0].name = "笔记本";

        System.out.println(merchandise[0].name);

        System.out.println(merchandise[2]);
    }
}
