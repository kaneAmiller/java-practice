package leetcode.p2798;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (target <= hour) {
                count += 1;
            }
        }

        return count;
    }
}