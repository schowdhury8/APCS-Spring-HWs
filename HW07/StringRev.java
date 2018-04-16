public class StringRev {
    public static void main(String[] args) {
        String s = "stressed";
        String y = "";
        for (int i = s.length(); i > 0; i--) {
            y += s.substring(i-1, i);
        }
        System.out.println(y);
    }
}