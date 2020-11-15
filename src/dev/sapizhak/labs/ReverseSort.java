public class ReverseSort {
    public static void main(String[] args) {
        final int num = 613746;
        int holder, number = 0;
        String numStr = Integer.toString(num);
        int lim = numStr.length();
        int[] numbers = new int[lim];
        for (int i = 0; i < lim; i++) {
            numbers[i] = numStr.charAt(i) - '0';
        }
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    holder = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = holder;
                }
            }
        }
        for (int i = 0; i < lim; i++) {
            number += numbers[i];
            number *= 10;
        }
        System.out.println(number / 10);
    }
}