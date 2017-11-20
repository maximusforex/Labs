public class MyPiramid {
    static void printPyramid(int h){
        if(h<=0||h>9){
            System.out.println("Wrong Enter");
        }else
        for(int i=0;i<=h;i++){
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
