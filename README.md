# Technical Assessment Java

## General

Write a function as described below and test scenarios to test its validity.

## Details
Write a function that finds missing number in array:
- Given array of sequent numbers 0,1,2,3...N with missing member.
- Function finds a first missing number occurrence in the sequence.

## Solution
- The method checks if the array is null, empty, or contains only one element, returning -1 in these cases.
- It calculates the minimum and maximum values in the array.
- If there are too many missing numbers (more than one), it returns -1.
- If no numbers are missing, it also returns -1.
- It uses the formula for the sum of an arithmetic series to compute the expected sum and compares it to the actual sum of the array elements.
- The difference between the expected and actual sums gives the missing number.
