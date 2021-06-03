package main;

/**
 * @author bkariuki
 */
public class Safa {
    public static void main(String[] args) {
        System.out.println(solution("<<<>>>"));
        int[] res = {23,4,6,7};
//        System.out.println(filters(res));
    }

    static int solution(String S) {
        int length = S.length() - 1;
        char[] string = S.toCharArray();
        for (char s : string) {
            if (S.indexOf(s) == 's') {
                length = S.lastIndexOf(s);
                ++length;
            }
        }
        return length;
    }

    static int filters(int[] A) {
        int filtered = 0;
        int sum = 0;
            for (int i = 0;i<A.length;i++) {
                sum  +=A[i];
                if (sum % 2 == 0)
                if (A[i] % 2 == 0) {
                    filtered = filtered++;
                } else {
                    filtered++;
                }
            }

        return filtered;
    }
}
