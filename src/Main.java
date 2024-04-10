import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        printEven();
        printStars();
        printOdd();
        printStars();
        printuniqueness();
        printStars();
        printDoubles();


    }

    public static void printStars() {
        System.out.println("*************************");

    }

    public static void printEven() {
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums2);
        for (int i = 0; nums2.size() > i; i++) {
            if (nums2.get(i) % 2 == 0) {
                System.out.println(nums2.get(i));
            }
        }
    }

    public static void printOdd() {
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums2);
        int doubl = 0;
        for (int num : nums2) {
            if (num % 2 == 0 && num != doubl) {
                System.out.println(num);
                doubl = num;

            }
        }
    }

    public static void printuniqueness() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> uniqueClothes = new HashSet<>();
        List<String> duplicates = strings.stream()
                .filter(n -> !uniqueClothes.add(n))
                .collect(Collectors.toList());
        System.out.println(uniqueClothes);

    }

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void printDoubles() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        HashMap<String, Integer> doubli = new HashMap<>();
        for (String item : strings) {
            if (!doubli.containsKey(item)) {
                doubli.put(item, 1);
            } else
                doubli.put(item, doubli.get(item) + 1);
        }
        System.out.println(doubli);

    }
}