public class HW05_4110064229_1 extends littlebit {
    public int l_bit(int[] A) {
        if (A.length == 1)
            return 1;
        int sum = 0;
        int tmp = 1;
        boolean is_mtop = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] <= A[i + 1]) {
                if (is_mtop)
                    is_mtop = false;
                else
                    sum += tmp;
                if (A[i] != A[i + 1])
                    tmp++;
                continue;
            }
            if (!is_mtop) {
                A[i] = -tmp;
                is_mtop = true;
            }
            tmp = 1;
        }
        if (A.length >= 2 && A[A.length - 2] <= A[A.length - 1])
            sum += tmp;
        tmp = 1;
        for (int i = A.length - 1; i > 0; i--) {
            if (A[i] < 0) {
                sum += Math.max(-A[i], tmp);
            }
            else if (A[i] < A[i - 1] || A[i - 1] < 0) {
                sum += tmp;
                if (A[i] != A[i - 1])
                    tmp++;
                continue;
            }
            tmp = 1;
        }
        if (A.length >= 2 && A[0] >= A[1])
            sum += tmp;
        return sum;
    }
}
