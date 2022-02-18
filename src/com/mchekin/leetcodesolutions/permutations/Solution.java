package com.mchekin.leetcodesolutions.permutations;

import java.util.ArrayList;
import java.util.Collections;
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

        permutations(list, 0,  answer);

        return answer;
    }

    private void permutations(List<Integer> numbers, int i, List<List<Integer>> answer) {

        if (i == numbers.size()) {
            answer.add(new ArrayList<>(numbers));
        }

        for (int j = i; j < numbers.size(); j++) {
            Collections.swap(numbers, i, j);
            permutations(numbers, i + 1, answer);
            Collections.swap(numbers, i, j);
        }
    }
}
