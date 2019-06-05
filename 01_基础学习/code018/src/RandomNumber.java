public class RandomNumber {
    public static void main(String[] args) {
        double randNum = 0;

        while(randNum < 0.5){
            randNum = Math.random();
            System.out.println(randNum);
        }

        int randStart = 30;
        int randEnd = 90;

        //确定模
        int mod = randEnd - randStart;

        //生成随机数
        randNum = Math.random();

        int num = (int)((randNum*randEnd*100)%mod);

        num += randStart;

        if(num <= randStart){
            num = randStart+1;
        }
        if(num>=randEnd){
            num=randEnd-1;
        }

        System.out.println("这次的随机数是：" + num);
    }
}
