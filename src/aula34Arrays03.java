public class aula34Arrays03 {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Goku";
        name[1] = "Gon";
        name[2] = "Naruto";
        name[3] = "Luffy";
        name[4] = "Ichigo";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
