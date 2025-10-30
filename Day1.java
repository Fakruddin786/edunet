// class Day1 {
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=5-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

class Day1 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                for(int k=i;k<=2*(5-i+1)-1;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 