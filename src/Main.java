import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        String [][] array = new String[5][3];
        /*for(int i = 0; i < array.length; ++i)
            for (int j = 0; j < array[i].length; ++j)
                if(i == 0 || i == 2 || j == 0 || j == 3)
                    array[i][j] = " * ";
                else array[i][j] = "   ";*/       //For A letter

        //(1,1)  |  (2,2)  | (4,1)
        for(int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j){
                if((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 1) || (i == 4 && j == 2)) {
                    array[i][j] = "  ";
                }
                else array[i][j] = "* ";
            }
        }


        for(int i = 0; i < array.length; ++i){
            for (int j = 0; j < array[i].length; ++j)
                System.out.print(array[i][j]);
            System.out.println("");
        }

        /*System.out.println("----------------------------");
        for(String[]row : array){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }*/

    }
}
