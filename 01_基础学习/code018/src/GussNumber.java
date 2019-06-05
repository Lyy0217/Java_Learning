import java.util.Scanner;

public class GussNumber {
    public static void main(String[] args) {
        //创建scanner，从控制台输入
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangStart = 1;
        int rangEnd = 100;
        int guessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int totalCorroctCount = 0;

        //是否结束游戏
        boolean stopGame = false;

        while (!stopGame) {
            //初始化本次游戏的变量
            int guessLeft = guessTotal;
            int mod = rangEnd - rangStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangEnd * 100)) % mod;
            num += rangStart;

            if (num <= rangStart) {
                num = rangStart + 1;
            }
            if (num >= rangEnd) {
                num = rangEnd - 1;
            }
            System.out.println("=================== 猜 数 字 ===================");
            System.out.println("目标数已经生成，数字在" + rangStart + "到" + rangEnd + "之间，" +
                    "不包括这两个数。共有" + guessTotal + "次猜测的机会。输入-1随时结束游戏。");

            //本次游戏是否开始
            boolean startGame = true;

            //本次是否猜中数字
            boolean guessCorrect = false;
            while (guessLeft > 0) {
                System.out.println("还有" + guessLeft + "次机会，请输入猜测的数字，回车确认");
                int guessNum = in.nextInt();
                //输入-1游戏结束
                if (guessNum == -1) {
                    stopGame = true;
                    break;
                }

                if (guessNum <= rangStart || guessNum >= rangEnd) {
                    System.out.println("请输入在" + rangStart + "到" + rangEnd + "之间，的数字，不包括这两个数。");
                    continue;
                }

                //只要至少猜过一次，就算玩过了
                if (startGame) {
                    totalGameCount++;
                    startGame = false;
                }

                //可以用的猜测次数减1；
                guessLeft--;
                if (guessNum == num) {
                    totalCorroctCount++;
                    guessCorrect = true;
                    System.out.println("恭喜你猜对了！这次的数字就是" + num +
                            "。本次你共猜了" + (guessTotal - guessLeft) + "次。");
                    break;
                } else if (guessNum > num) {
                    System.out.println("猜测的数字比目标数字大。");
                } else {
                    System.out.println("猜测的数字比目标数字小。");
                }

            }
            if (!guessCorrect) {
                System.out.println("本次的目标数字是" + num + "。这次没有猜中。");
            }
        }
        System.out.println("共进行了" + totalGameCount + "次游戏，其中正确的为" + totalCorroctCount + "次");
    }
}
