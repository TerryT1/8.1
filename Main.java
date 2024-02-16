
public class Main {
    public static void main(String[] args) {
        int[][] Ints = new int[2][2];
        double[][] Doubles = new double[2][2];
        boolean[][] Booleans = new boolean[2][2];
        String[][] Strings = new String[2][2];
        //Food[][] Foods = new Food[2][2];

        Ints[0][0] = 1;
        Ints[0][1] = 2;
        Ints[1][0] = 3;
        Ints[1][1] = 4;

        Doubles[0][0] = 1.0;
        Doubles[0][1] = 2.0;
        Doubles[1][0] = 3.0;
        Doubles[1][1] = 4.0;

        Booleans[0][0] = false;
        Booleans[0][1] = true;
        Booleans[1][0] = false;
        Booleans[1][1] = true;

        Strings[0][0] = "a";
        Strings[0][1] = "b";
        Strings[1][0] = "c";
        Strings[1][1] = "d";

        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < 2; a++) {
                System.out.print(Ints[i][a]);
                System.out.print(Doubles[i][a]);
                System.out.print(Booleans[i][a]);
                System.out.print(Strings[i][a]);
            }
        }
    }
}





