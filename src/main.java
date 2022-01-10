import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Teste 1
        int[] value = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] value1 = {1, 6, -1, 10};
        if(isSubsequent(value, value1)) {
            System.out.println("É subsequente");
        } else {
            System.out.println(("Não é subsequente"));
        }

        // Teste 2
        String[] result = removeDuplicates(new String[]{"g", "g", "y", "c", "c", "c", "q", "c", "y", "y"});
        for(String i: result) {
            System.out.println(i);
        }

        // Teste 3
        Boolean[] palindrome = verifyPalindromes(new String[]{"arara", "jabuticaba", "asa", "caminhao"});
        for(Boolean i: palindrome) {
            System.out.println(i);
        }
    }

    public static boolean isSubsequent(int[] values, int[] sequence) {
        int index = 0;
        try {
            for (int value : values) {
                if (value == sequence[index]) {
                    index++;
                }
            }
        } catch (Exception ignore) {}
        return index == sequence.length;
    }

    public static String[] removeDuplicates(String[] values) {
        List<String> result = new ArrayList<>();
        for (String value : values) {
            if (result.size() < 1) result.add(value);
            if (!value.equals(result.get(result.size() - 1))) {
                result.add(value);
            }
        }
        return result.toArray(new String[0]);
    }

    public static Boolean[] verifyPalindromes(String[] values) {
        List<Boolean> result = new ArrayList<>();
        for (String value: values) {
            String rev = new StringBuffer(value).reverse().toString();
            if (rev.equals(value)) {
                result.add(true);
                continue;
            }
            result.add(false);
        }
        return result.toArray(new Boolean[0]);
    }
}
