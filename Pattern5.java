public class Pattern5 {
    public static void main(String[] args) {
        // int rows = 5;
        // for(int i = 1; i<= rows; i++){
        //     for(int j = rows+1-i; j<=rows; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        int rows = 5;
        for(int i = 1; i<=rows; i++){
          int k = rows+1-i;
          for(int j= 1 ; j<=i; j++){
            // System.out.print(k + " ");
            System.out.print((char)(64+k) + " ");
            k++;
          }
          System.out.println();
        }
    }
}
