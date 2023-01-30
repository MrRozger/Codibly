package org.example;

import java.util.HashMap;

public class BalancedWordsCounter {
    public int count(String input) {
        if (input == null) {
            throw new RuntimeException("Input cannot be null");
        }

        if (!input.chars().allMatch(Character::isLetter)) {
            throw new RuntimeException("Input can contain only letters");
        }

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subWord = input.substring(i, j);
                if (isBalanced(subWord)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isBalanced(String word) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        int firstCount = 0;
        for (int count : frequency.values()) {
            if (firstCount == 0) {
                firstCount = count;
            } else if (firstCount != count) {
                return false;
            }
        }
        return true;
    }
}