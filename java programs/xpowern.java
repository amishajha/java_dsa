class xpowern {

    public static int calculatepower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calculatepower(x, n / 2) * calculatepower(x, n / 2);
        } else {
            return calculatepower(x, n / 2) * calculatepower(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;
        int ans = calculatepower(x, n);
        System.out.println(ans);

    }
}
