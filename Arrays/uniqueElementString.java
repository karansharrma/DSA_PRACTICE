public class uniqueElementString {
    public static void main(String[] args) {
        String str = "karan";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == current) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("First unique character: " + current);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No unique character found.");
        }
    }
}
