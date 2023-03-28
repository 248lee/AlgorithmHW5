public class HW05_4110064229_1 extends littlebit {
    public int l_bit(int[] A) {
        int itr = 0;
        int total_rst = 0;
        {
            int tmpitr = itr;
            int cul = 1;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] >= A[tmpitr]) {
                cul += (A[tmpitr + 1] > A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            int mountain_top = cul;

            cul = 1;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] <= A[tmpitr]) {
                cul += (A[tmpitr + 1] < A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            int mountain_feet = cul;

            // start counting rst
            cul = 1;
            int rst = 0;
            tmpitr = itr;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] >= A[tmpitr]) {
                rst += cul;
                cul += (A[tmpitr + 1] > A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            rst += Math.max(mountain_feet, mountain_top);
            cul = mountain_feet;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] <= A[tmpitr]) {
                cul -= (A[tmpitr + 1] < A[tmpitr] ? 1 : 0);
                rst += cul;
                tmpitr++;
            }
            tmpitr++;
            total_rst += rst;
            itr = tmpitr;
        }

        
        while (itr < A.length)
        {
            int tmpitr = itr;
            int cul = 2;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] >= A[tmpitr]) {
                cul += (A[tmpitr + 1] > A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            int mountain_top = cul;

            cul = 1;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] <= A[tmpitr]) {
                cul += (A[tmpitr + 1] < A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            int mountain_feet = cul;

            // start counting rst
            cul = 2;
            int rst = 0;
            tmpitr = itr;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] >= A[tmpitr]) {
                rst += cul;
                cul += (A[tmpitr + 1] > A[tmpitr] ? 1 : 0);
                tmpitr++;
            }
            rst += Math.max(mountain_feet, mountain_top);
            cul = mountain_feet;
            while (tmpitr + 1 < A.length && A[tmpitr + 1] <= A[tmpitr]) {
                cul -= (A[tmpitr + 1] < A[tmpitr] ? 1 : 0);
                rst += cul;
                tmpitr++;
            }
            tmpitr++;
            total_rst += rst;
            itr = tmpitr;
        }
        return A.length != 0 ? total_rst : 0;
    }
}
