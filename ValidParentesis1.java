import java.util.*;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> d = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='{' || c=='(' || c=='[')
            d.push(c);
            else{
                if(d.empty())
                return false;
               else if(c==')' && d.peek()!='(')
                return false;
                else if(c==']' && d.peek()!='[')
                return false;
                else if(c=='}' && d.peek()!='{')
                return false;
                else
                d.pop();
            }
        }
        return d.empty();
    }
}