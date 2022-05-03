package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiuHanxu
 * @Classname LetterCombinations
 * @Description TODO
 * @Date 2022/4/26 21:16
 */
public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "42";
        System.out.println(letterCombinations2(digits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        List<List<String>> resultLists = new ArrayList<>();
        List<List<String>> stringLists = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            List<String> list = new ArrayList<>();
            if (digits.charAt(i) == '2') {
                list.add("a");
                list.add("b");
                list.add("c");
            } else if (digits.charAt(i) == '3') {
                list.add("d");
                list.add("e");
                list.add("f");
            } else if (digits.charAt(i) == '4') {
                list.add("g");
                list.add("h");
                list.add("i");
            } else if (digits.charAt(i) == '5') {
                list.add("j");
                list.add("k");
                list.add("l");
            } else if (digits.charAt(i) == '6') {
                list.add("m");
                list.add("n");
                list.add("o");
            } else if (digits.charAt(i) == '7') {
                list.add("p");
                list.add("q");
                list.add("r");
                list.add("s");
            } else if (digits.charAt(i) == '8') {
                list.add("t");
                list.add("u");
                list.add("v");
            } else if (digits.charAt(i) == '9') {
                list.add("w");
                list.add("x");
                list.add("y");
                list.add("z");
            }
            stringLists.add(list);
        }
//        System.out.println(stringLists);
        descartes(stringLists, resultLists, 0, new ArrayList<>());
        for (List<String> resultList : resultLists) {
            String result = "";
            for (String s : resultList) {
                result += s;
            }
            results.add(result);
        }
        return results;
    }
    private static List<String> letterCombinations2(String digits) {
        List<String> results = new ArrayList<>();
        List<List<String>> stringLists = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            List<String> list = new ArrayList<>();
            if (digits.charAt(i) == '2') {
                list.add("a");
                list.add("b");
                list.add("c");
            } else if (digits.charAt(i) == '3') {
                list.add("d");
                list.add("e");
                list.add("f");
            } else if (digits.charAt(i) == '4') {
                list.add("g");
                list.add("h");
                list.add("i");
            } else if (digits.charAt(i) == '5') {
                list.add("j");
                list.add("k");
                list.add("l");
            } else if (digits.charAt(i) == '6') {
                list.add("m");
                list.add("n");
                list.add("o");
            } else if (digits.charAt(i) == '7') {
                list.add("p");
                list.add("q");
                list.add("r");
                list.add("s");
            } else if (digits.charAt(i) == '8') {
                list.add("t");
                list.add("u");
                list.add("v");
            } else if (digits.charAt(i) == '9') {
                list.add("w");
                list.add("x");
                list.add("y");
                list.add("z");
            }
            stringLists.add(list);
        }
//        System.out.println(stringLists);
        descartes2(stringLists, results, 0, new ArrayList<>());
        return results;
    }
    public static void descartes(List<List<String>> dimensionValue, List<List<String>> result, int layer, List<String> currentList) {
        if (layer < dimensionValue.size() - 1) {
            if (dimensionValue.get(layer).size() == 0) {
                descartes(dimensionValue, result, layer + 1, currentList);
            } else {
                for (int i = 0; i < dimensionValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(currentList);
                    list.add(dimensionValue.get(layer).get(i));
                    descartes(dimensionValue, result, layer + 1, list);
                }
            }
        } else if (layer == dimensionValue.size() - 1) {
            if (dimensionValue.get(layer).size() == 0) {
                result.add(currentList);
            } else {
                for (int i = 0; i < dimensionValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(currentList);
                    list.add(dimensionValue.get(layer).get(i));
                    result.add(list);
                }
            }
        }
    }
    public static void descartes2(List<List<String>> dimensionValue, List<String> result, int layer, List<String> currentList) {
        if (layer < dimensionValue.size() - 1) {
            if (dimensionValue.get(layer).size() == 0) {
                descartes2(dimensionValue, result, layer + 1, currentList);
            } else {
                for (int i = 0; i < dimensionValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(currentList);
                    list.add(dimensionValue.get(layer).get(i));
                    descartes2(dimensionValue, result, layer + 1, list);
                }
            }
        } else if (layer == dimensionValue.size() - 1) {
            if (dimensionValue.get(layer).size() == 0) {
                result.addAll(currentList);
            } else {
                for (int i = 0; i < dimensionValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(currentList);
                    list.add(dimensionValue.get(layer).get(i));
                    result.addAll(list);
                }
            }
        }
    }
}
