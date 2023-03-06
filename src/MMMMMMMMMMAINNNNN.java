import java.util.Arrays;

public class MMMMMMMMMMAINNNNN {
    public static void main(String[] args) {
        // a.
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        // b.
        seatingChart[1][2] = "Paul";
        // c.
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        // d.
        String[] temp1 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp1;
        // e.
        for (String[] aaa : seatingChart) {
            System.out.println(Arrays.toString(aaa));
        }
    }
}