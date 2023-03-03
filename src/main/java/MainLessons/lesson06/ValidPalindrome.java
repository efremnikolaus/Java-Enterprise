package MainLessons.lesson06;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newStr="";
        String revStr="";
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch <=122)){
                if(ch>=65 && ch<=90) ch= (char) (ch+32);
                newStr += ch;
                revStr = ch+revStr;
            }
        }
        return (revStr.equals(newStr)) ? true: false;
    }
}
