public class HW05_4110064229_3 extends littlebit {
    public int l_bit(int[] A) {
        int rst = 0;
        int n = A.length;

        int i = 0;
        int cnt, cul, num_same_cul, mountain_top;
        {
            cnt = 0;
            cul = -1;
            for (; i + 1 < n && A[i + 1] <= A[i]; i++, cnt++) {
                rst += cul;
                cul -= (A[i + 1] < A[i] ? 1 : 0);
            }
            rst += (-cul + 1) * cnt;
        }
        while (i < n) {
            cul = 1;
            num_same_cul = 0;
            for (; i + 1 < n && A[i + 1] >= A[i]; i++) {
                rst += cul;
                if (A[i + 1] > A[i]) {
                    cul++;
                    num_same_cul = 0;
                }
                else {
                    num_same_cul++;
                }
            }
            rst -= cul * num_same_cul;
            mountain_top = cul;
            i++;
            cnt = 0;
            cul = -1;
            for (; i + 1 < n && A[i + 1] <= A[i]; i++, cnt++) {
                rst += cul;
                cul -= (A[i + 1] < A[i] ? 1 : 0);
            }
            rst += (-cul + 1) * cnt;
            if (cnt != 0)
                rst += Math.max(mountain_top, -cul + 1) * (num_same_cul + 1);
            else
                rst += mountain_top * (num_same_cul + 1);
        }
        return rst;
    }
}
