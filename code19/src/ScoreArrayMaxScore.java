import javax.crypto.Mac;

public class ScoreArrayMaxScore {
    public static void main(String[] args) {
       //声明六个变量分别代表六门成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int YingYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5

        //每门课的名字;
        String[] names = new String[6];

        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[YingYuIndex] = "英语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        //没门课的成绩
        double[] scores = new double[6];

        //随机数给每门课分成绩

        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + Math.random() * 20;
        }

        //计算最高成绩和最高成绩对应的索引
        double MaxScore = 0;
        int MaxScoreIndex = -1;
        for (int i = 0;i<6;i++ ){
            if(scores[i]>MaxScore){
                MaxScore = scores[i];
                MaxScoreIndex = i;
            }
        }

        // 输出最高成绩科目和成绩
        System.out.println("最高分的科目为" + names[MaxScoreIndex] + "，成绩为：" + MaxScore);
    }
}
