package cc.before30.codeex.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx {

    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        collection.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        collection.stream()
                .filter(v -> v.length() < 4)
                .collect(Collectors.toList());

        List<List<String>> collection2 = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
        collection2.stream()
                .flatMap(v -> v.stream())
                .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .reduce(0, (acc, n) -> acc + n);

        System.out.println(numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics().getSum());

        System.out.println(numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics().getMax());

        System.out.println(numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics().getCount());

        System.out.println(numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics().getMin());

        System.out.println(numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics().getAverage());

        Map<Boolean, List<Integer>> collects = numbers.stream()
                .collect(Collectors.partitioningBy(x -> x > 4));

        numbers.stream()
                .collect(Collectors.groupingBy(x -> x));

//        numbers.stream()
//                .collect(Collectors.joining(", ", "prefix", "suffix"));


    }

}
