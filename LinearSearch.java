/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;

/**ID: 445013878
 *NAme: مودة ابراهيم عمر الشبلي
 * @author مودة
 */
// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]

            static int search(int arr[], int n, int x)

            {

                        for (int i = 0; i < n; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[i] == x)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] arr = { 3, 4, 1, 7, 5 };

                        int n = arr.length;

                        int x = 5; // changed index value by Mawaddah

                        int index = search(arr, n, x);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//-----------------------------------------------------------------------------------------------------
