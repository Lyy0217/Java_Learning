public class RefAndNull {
    public static void main(String[] args) {
        // 数组在创建出来之后，会按照类型给数组中的每个元素赋缺省值。
        // 引用类型的缺省值是null
        Merchandise[] merchandise = new Merchandise[9];

        //给索引为偶数的引用赋值
        for (int i = 0; i < merchandise.length; ++i) {
            if (i % 2 == 0) {
                merchandise[i] = new Merchandise();
            }
        }
        System.out.println();
        //依次输出数组的值
        for (int i = 0; i < merchandise.length; ++i) {
            System.out.println(merchandise[i]);
        }
        System.out.println();
        for (int i = 0; i < merchandise.length; ++i) {
            if (i % 2 == 0) {
                Merchandise m = merchandise[i];
                System.out.println(m.name);
                System.out.println(m.id);
                System.out.println(m.price);
                System.out.println(m.count);
            }
        }
    }
}
