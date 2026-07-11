public class LongestName {
    public static void main(String[] args) {
        String[] names = {"raghav", "yash", "suraj", "kartik"};

        String longest = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }

        System.out.println("Longest name : " + longest);
    }
}