class Solution {

    public void reverseString(char[] s) {
        reverse(s, 0);
    }

    void reverse(char[] s, int idx) {

        if (idx >= s.length / 2) {
            return;
        }

        char temp = s[idx];
        s[idx] = s[s.length - 1 - idx];
        s[s.length - 1 - idx] = temp;

        reverse(s, idx + 1);
    }
}