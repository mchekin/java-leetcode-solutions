package com.mchekin.leetcodesolutions.permutations.backtracking2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();

        if (nums == null) {
            return answer;
        }

        List<Integer> list = new ArrayList<>();

        for (int number : nums) {
            list.add(number);
        }

        permutations(list, new ArrayList<>(),  answer);

        return answer;
    }

    private void permutations(List<Integer> numbers, List<Integer> prefix, List<List<Integer>> answer) {

        if (numbers.size() == 0) {
            answer.add(prefix);

            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> remaining = new ArrayList<>(numbers);
            List<Integer> newPrefix = new ArrayList<>(prefix);

            Integer currentNumber = remaining.remove(i);
            newPrefix.add(currentNumber);

            permutations(remaining, newPrefix, answer);
        }
    }
}
