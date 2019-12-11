public class Main {
    public static void main(String[] args) {

        String[][] array2 = new String[7][7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                if ((i+j == 6) || i == j) {
                    array2[i][j] = "X";
                }
                if (array2[i][j] == null) {
                    array2[i][j] = " ";
                }
                System.out.print(array2[i][j]+ " ");

            }
            System.out.println("");
        }
    }
}
