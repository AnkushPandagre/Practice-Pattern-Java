public class Pattern4 {
    public static void main(String[] args) {
        // int rows = 5;
        // for(int i = 1; i<=rows; i++){
        //     for(int j = i ; j>=1; j--){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
 
        // --------------
        int rows = 5;
        for(int i = 1; i<=rows; i++ ){
            int k = i;
            for(int j = 1; j<=i; j++){
                System.out.print((char)(64+k) + " ");
                k--;
            }
            System.out.println();
        }


    }
}
