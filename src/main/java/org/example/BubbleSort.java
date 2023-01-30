package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException("Input cannot be null");
        }
        List<Comparable> output = new ArrayList<>(input);
        output.removeIf(Objects::isNull);

        for (int i = 0; i < output.size() - 1; i++) {
            for (int j = 0; j < output.size() - i - 1; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    Comparable temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}