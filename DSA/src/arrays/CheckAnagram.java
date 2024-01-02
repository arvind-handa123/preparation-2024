package arrays;

import java.util.Arrays;

/**
 *
 * @author Arvind Handa
 *
 * Problem Description:
 *
 * Given two strings. The task is to check whether the given strings are anagrams of each other or not.
 * An anagram of a string is another string that contains the same characters, only the order of characters
 * can be different. For example, “abcd” and “dabc” are an anagram of each other.
 *
 * Example 1:
 *
 * Input: str1 = “listen”  str2 = “silent”
 * Output: “Anagram”
 * Explanation: All characters of “listen” and “silent” are the same.
 *
 * Example 2:
 *
 * Input: str1 = “gram”  str2 = “arm”
 * Output: “Not Anagram”
 *
 * Follow the steps to implement the idea:-
 *
 *     1. Sort both strings.
 *     2. Compare the sorted strings:
 *         2.1 If they are equal return True.
 *         2.2 Else return False.
 */

public class CheckAnagram {

    private static boolean isAnagram(final char[] str1, final char[] str2){

        // Get lengths of both strings
        final int n1 = str1.length;
        final int n2 = str2.length;

        // If length of both strings is not same, then they cannot be anagram
        if (n1 != n2) {
            return false;
        }

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final String str1 = "listen";
        final String str2 = "silent";

        // Function Call
        if (isAnagram(str1.toCharArray(), str2.toCharArray())) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
