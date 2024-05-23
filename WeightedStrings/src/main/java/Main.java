import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int n = scanner.nextInt();

        int currWeight = 0;
        char prevLetter = ' ';

        Set<Integer> weights = new HashSet<>();
        for(char letter : word.toCharArray()) {
            if(letter != prevLetter) {
                currWeight = letter - 'a' + 1;
            }
            else {
                currWeight += letter - 'a' + 1;
            }
            prevLetter = letter;
            weights.add(currWeight);
        }

        List<String> output = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int weight = scanner.nextInt();
            if(weights.contains(weight))
                output.add("Yes");
            else
                output.add("No");
        }

        System.out.println(output);
    }
}