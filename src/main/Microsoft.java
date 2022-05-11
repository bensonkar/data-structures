package main;

public class Microsoft {
    //smallest number in int N
    public int solution(int N) {
        // write your code in Java SE 11
        String s = String.valueOf(N);
        int a = s.length();

        if (N < 10) {
            return 0;
        }
        if (a >= 1) {
            return (int) Math.pow(10, (a - 1));
        } else {
            return 1;
        }
    }
    //scientific doing research
    public int solution(int[] A) {
        // write your code in Java SE 11
        int stable = 0;
        if (A.length < 3) {
            return 0;
        }
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                if ((A[j + 1] - A[j]) == (A[i + 1] - A[i])) {
                    stable++;
                } else {
                    break;
                }
            }
        }

        if (stable > 1000000000) {
            return -1;
        }
        return stable;
    }
}
