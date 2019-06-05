public class MultiDimensionArray {
    public static void main(String[] args) {
        //创建一个double类型的二维数组
        double[][] multiDimensionArray = new double[3][5];

        for(int i =0;i<multiDimensionArray.length;i++){
            for(int j =0;j<multiDimensionArray[i].length;j++){
                System.out.println("multiDimensionArray["+i+"]"+"["+j+"]="+multiDimensionArray[i][j]);
            }
        }

        multiDimensionArray[2] = new double[100];

        for(int i=0;i<multiDimensionArray.length;i++){
            System.out.println("multiDimensionArray[" + i + "].length=" + multiDimensionArray[i].length);
        }
    }
}
