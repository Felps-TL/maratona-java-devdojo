public class aula36ArraysMult01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Month
        // 31,28,31,30 Days
        int [][] days = new int [3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

        days[2][0] = 31;
        days[2][1] = 30;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("___________________________");
        for (int [] arrBase: days) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
