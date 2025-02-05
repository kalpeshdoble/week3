import org.example.StringBuilder.Reverse;
import org.junit.jupiter.api.*;

import static org.example.BinnarySearch.BinarySearchFirstLast.binarySearchFirst;
import static org.example.BinnarySearch.BinarySearchFirstLast.binarySearchLast;
import static org.example.BinnarySearch.FindRotationPoint.findRotationPoint;
import static org.example.BinnarySearch.PeekElement.findPeak;
import static org.example.BinnarySearch.SearchIn2DArray.searchMatrix;

import static org.example.ChallengeProblem.LinearAndBinarySearch.binarySearch;
import static org.example.ChallengeProblem.LinearAndBinarySearch.firstMissingPositive;
import static org.example.LinearSearch.FirstNagetiveNumber.firstNagetiveNumber;
import static org.example.LinearSearch.SearchSpecificWord.findSentenceWithWord;
import static org.example.StringBuffer.ConcatenateString.concatenateString;
import static org.example.StringBuffer.StringConcatenationComparison.stringConcatenationComparison;
import static org.example.StringBuilder.Reverse.reverseString;
import static org.example.StringBuilder.RemoveDuplicate.removeDuplicate;

public class test {
    @Test
    void test1() {
        Assertions.assertEquals("hseplak", reverseString("kalpesh"));
    }

    @Test
    void test2() {
        Assertions.assertEquals("helow", removeDuplicate("heeeellloooowwww"));
    }

    @Test
    void test3() {
        String arr[] = {"Hellow", "to", "capgemini", "from", "my", "side"};
        Assertions.assertEquals("Hellowtocapgeminifrommyside", concatenateString(arr));
    }
    @Test
    void test4() {
        int arr[]={1,2,3,45,3,-4,5,6};
        Assertions.assertEquals(5, firstNagetiveNumber(arr));
    }

    @Test
    void test5() {
        String[] sentences = {
                "Hellow to capgemini taem.",
                "I am kalpesh doble",
                "I am learning Java.",
                "Linear search is simple.",
                "Searching for a word in a sentence.",
                "This is the search last sentence."};
        String targetWord = "search";
        Assertions.assertEquals("Linear search is simple.", findSentenceWithWord(sentences, targetWord));
    }
    @Test
    void test6() {
        int arr[]={8,9,10,11,6,7,4,3,5,6};
        Assertions.assertEquals(6, findRotationPoint(arr));
    }

    @Test
    void test7() {
        int[] arr = {1, 3, 20, 4, 1};
        Assertions.assertEquals(2,findPeak(arr));
    }

    @Test
    void test8() {
        int[][] matrix = {
                {1, 3, 5},
                {10, 12, 14},
                {20, 22, 24},
                {30, 35, 40}};
        int target1 = 22;
        Assertions.assertEquals(true,searchMatrix(matrix, target1));
    }
    @Test
    void test9() {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        int target = 2;
        Assertions.assertEquals(3,binarySearchLast(arr, target));
        Assertions.assertEquals(1,binarySearchFirst(arr, target));
    }

    @Test
    void test10() {
        int[] arr = {3, 4, -1, 1};
        int target = 4;
        Assertions.assertEquals(2,firstMissingPositive(arr));
        Assertions.assertEquals(3,binarySearch(arr,target));
    }


}










