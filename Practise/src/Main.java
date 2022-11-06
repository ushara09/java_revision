public class Main {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(4);
        pattern5(3);
    }

     static void pattern5(int n) {

        for(int row = 1; row <= 2*n-1; row++){

        }

    }

    static void pattern1(int a){
        for (int row = 1; row <= a ; row++) {
            for(int col = 1; col <= a+1-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int a){
        for (int row = 1; row <= a ; row++) {
            for(int col = 1; col <= row; col ++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row <= 2*n-1; row++){
            int totalColumNum = row > n ? 2*n-row : row;
            for(int col = 1; col <= totalColumNum; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
