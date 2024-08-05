package activites;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int[] no = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(no));
        int searchno = 10;
        int fixedno = 30;
        System.out.println("Result: " + result(no, searchno, fixedno));
    }

    public static boolean result(int[] nos, int searchno, int fixedno) {
        int temp= 0;
        for (int number : nos) {
            if (number == searchno) {
                temp += searchno;
            }
            if (temp > fixedno) {
                break;
            }
        }
        return temp == fixedno;

	}

}
