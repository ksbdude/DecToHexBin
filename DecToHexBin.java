
public class DecToHexBin {

    void printBianary(int x) {
        int z = x;
        for (int y = 0; y <= x; y++) {
            z = y;
            String num = "";
            do {
                num = z % 2 + num;
                z = (int) z / 2;
            } while (z > 0);
            System.out.println(num);
        }
    }

    void printHexadecimal(int x) {
        String output = "";
        int result = x;
        int remain;
        while (result > 0) {
            remain = (int) (result % 16);
            result = (int) (result / 16);
            if (remain == 10) {
                output = 'A' + output;
            } else if (remain == 11) {
                output = 'B' + output;
            } else if (remain == 12) {
                output = 'C' + output;
            } else if (remain == 13) {
                output = 'D' + output;
            } else if (remain == 14) {
                output = 'E' + output;
            } else if (remain == 15) {
                output = 'F' + output;
            } else {
                output = remain + output;
            }
        }
        System.out.println(output);
    }
}
