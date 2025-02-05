package org.example.BinnarySearch;

public class PeekElement {
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search for peak element
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;  // Peak found
            }
            // If the left neighbor is greater, move to the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the right neighbor is greater, move to the right half
            else {
                left = mid + 1;
            }
        }

        // If no peak found (though theoretically shouldn't happen)
        return -1;
    }

        public static void main(String[] args) {
            // Test case: Example array
            int[] arr = {1, 3, 20, 4, 1};

            // Find peak element
            int peak = findPeak(arr);

            // Output the peak element
            if (peak != -1) {
                System.out.println("A peak element is: " + arr[peak]);
            } else {
                System.out.println("No peak element found.");
            }
        }


    }


