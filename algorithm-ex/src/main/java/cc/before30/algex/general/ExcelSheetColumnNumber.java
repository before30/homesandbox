package cc.before30.algex.general;

/*
https://leetcode.com/problems/excel-sheet-column-number/

 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A' + 1;
            number = number*26 + c;
        }
        return number;
    }
}
