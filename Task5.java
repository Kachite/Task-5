public class Task5 {
    public static void main(String[] args) {
        int h = 13;

        for (int i = 0; i <= h - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j <= h - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print('\\');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}