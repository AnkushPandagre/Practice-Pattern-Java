public class patttern3{
    public static void main(String[] args) {
        // int rows = 5;

        // for (int i = 1; i <=rows; i++) {
        //     for(int j = rows; j>=rows+1-i; j--){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // ----------------------
        int rows = 5;
        for (int i = 1; i <=rows; i++) {
            int k = rows;
            for(int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }
}
