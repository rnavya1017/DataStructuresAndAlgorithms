

public class HashmapUC2 {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

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