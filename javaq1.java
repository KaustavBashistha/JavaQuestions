package array;

public class javaq1 {
    public static void main(String[] args) {
       
        int[][] my2DArray = {{30}, {300, 500}, {3000, 5000, 5000}};

        
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}