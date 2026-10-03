
class Solution {

    public boolean backspaceCompare(String s, String t) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '#') {
                if (str1.length() > 0) {
                    str1.deleteCharAt(str1.length() - 1);
                }
            } else {
                str1.append(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (ch == '#') {
                if (str2.length() > 0) {
                    str2.deleteCharAt(str2.length() - 1);
                }
            } else {
                str2.append(ch);
            }
        }

        return str1.toString().equals(str2.toString());
    }
}

