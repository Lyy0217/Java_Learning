import java.util.Scanner;

public class OneArrayForAll {
    public static void main(String[] args) {
        //声明六个变量分别代表六门成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int YingYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        //每门课的名字;
        String[] names = new String[6];

        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[YingYuIndex] = "英语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);

        System.out.println("请输入公有多少年的成绩：");

        int YearCount = in.nextInt();

        double[][] scores = new double[YearCount][names.length];

        for (int i = 0; i < YearCount; i++ ){
            for (int j=0; j < names.length; j++) {
                scores[i][j] = 80 + (Math.random() * 20);
            }
        }

        System.out.println("请问要查第几年的成绩？");
        int YearToUse = in.nextInt() - 1;
        System.out.println("请问要查第几科的成绩？");
        int ScoreToUse = in.nextInt() - 1;

        System.out.println("第" + (YearToUse + 1) + "年的第" + (ScoreToUse + 1) + "科成绩是：" + scores[YearToUse][ScoreToUse]);
    }
}
