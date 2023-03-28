import edu.princeton.cs.algs4.In;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            In in = new In(args[0]);
            int[] a = in.readAllInts();
            HW05_4110064229_2 hw5_1 = new HW05_4110064229_2();
            HW05_4110064229_4 hw5_2 = new HW05_4110064229_4();
            // long start = System.currentTimeMillis();
            // int rs1 = hw5_2.l_bit(a);
            // long end = System.currentTimeMillis();
            // System.out.println("result1: " + rs1 + " Process Time: " + ((end - start) / 1000.0));
            long start2 = System.currentTimeMillis();
            int rs2 = hw5_1.l_bit(a);
            long end2 = System.currentTimeMillis();
            System.out.println("result2: " + rs2 + " Process Time: " + ((end2 - start2) / 1000.0));
        } else {
            int[] a = {7, 7, 7, 8, 8, 8, 7, 7, 6, 6, 7, 7, 8, 8, 9, 9};
            HW05_4110064229_2 hw5_1 = new HW05_4110064229_2();
            HW05_4110064229_4 hw5_2 = new HW05_4110064229_4();
            System.out.println(hw5_1.l_bit(a));
            System.out.println(hw5_2.l_bit(a));
        }
        
    }
}
