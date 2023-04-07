public class HW05_4110064229_3 extends littlebit {
    public int l_bit(int[] A) {
        int[] money = new int[A.length];
        for (int i = 0; i < money.length; i++) {
            money[i] = 1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                money[i + 1] = money[i] + 1;
            }
            else if (A[i] == A[i + 1]) {
                money[i + 1] = money[i];
            }
        }
        int sum = 0;
        for (int i = A.length - 1; i > 0; i--) {
            if (A[i] < A[i - 1]) {
                money[i - 1] = Math.max(money[i] + 1, money[i - 1]);
            }
            else if (A[i] == A[i - 1]) {
                money[i - 1] = Math.max(money[i], money[i - 1]);
            }
            sum += money[i];
        }
        sum += money[0];
        return sum;
    }
}
