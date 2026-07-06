

public class HashMapUC1 {

    public static void main(String[] args) {

        String paragraph =
                "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {

            Integer count = hashMap.get(word);

            if (count == null) {
                hashMap.add(word, 1);
            } else {
                hashMap.add(word, count + 1);
            }
        }

        System.out.println("Word Frequencies:");

        hashMap.display();
    }
}