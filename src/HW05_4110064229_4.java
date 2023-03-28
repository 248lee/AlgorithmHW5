public class HW05_4110064229_4 extends littlebit {
    public int l_bit(int[] A) {
        int rst = 0;
        int n = A.length;

        int i = 0;
        int cul = 1;
        while (i + 1 < n) {
            int num_same_cul = 1;
            for (; i + 1 < n && A[i + 1] >= A[i]; i++) {
                if (A[i + 1] > A[i]) {
                    rst += cul * num_same_cul;
                    cul++;
                    num_same_cul = 1;
                } else {
                    num_same_cul++;
                }
            }
            int mountain_top = cul;
            int cnt = 0;
            cul = 0;
            for (; i + 1 < n && A[i + 1] <= A[i]; i++, cnt++) {
                rst += cul;
                cul -= (A[i + 1] < A[i] ? 1 : 0);
            }
            rst += cul;
            rst += (-cul + 1) * cnt;
            rst += Math.max(mountain_top, -cul + 1) * (num_same_cul);

            // 為下一次做準備
            i++;
            cul = 2;
        }
        return rst;
    }
}
