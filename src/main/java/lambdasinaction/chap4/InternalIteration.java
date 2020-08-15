package lambdasinaction.chap4;

import java.util.*;
import java.util.stream.Collectors;

public class InternalIteration {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("This", "is", "a", "interesting", "book",
                "written", "by", "someone", "from", "Australia");

        List<String> capitalizedWords = words
                .stream()
                .filter(w -> {
                    System.out.println("Filtering " + w);
                    return w.length() > 2; })
                .map(w -> {
                    System.out.println("Mapping " + w);
                    return w.toUpperCase();})
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(capitalizedWords);

    }
}
