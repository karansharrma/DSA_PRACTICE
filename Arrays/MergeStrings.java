public class MergeStrings {
    public static void main(String[] args) {
        String str1 = "karan";
        String str2 = "sharma";
        StringBuilder result = new StringBuilder();

        int minLen = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLen; i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        System.out.println("Output: " + result.toString());
    }
}
