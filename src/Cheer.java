public class Cheer {

    public static void main(String[] args) {
        cheer(5);
        Greet.greet("Anikó");
        Count.count();
        Future.future();
    }

    public static void cheer(int param) {
        System.out.println("Pindúr Pandúrok!" + "My sweety param: " + param);
    }

}
