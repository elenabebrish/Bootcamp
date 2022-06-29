package TasksDay3;

public class MultiplicationTable {
    public static void main(String[] args) {

    int[][] table = new int[10][10];

        int row=1,column=1;
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = row*column;
                column = column+1;
            }
            row=row+1;
            column=1;
        }
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(" "+table[i][j] + "\t| ");
            }
            System.out.print("\n");
        }
    }
}