
public class Program {

    public static void main(String[] args) {
int[][] matrix = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array){
        StringBuilder x = new StringBuilder();
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                x.append(String.valueOf(array[i][j]));
            }
            x.append("\n");
        } return x.toString();
    }

}
