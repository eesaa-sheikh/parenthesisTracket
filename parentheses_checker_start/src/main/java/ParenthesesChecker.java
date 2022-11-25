import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesesChecker {
    ////////////////////////////////work
    static Stack<Character> stackChar;

    public ParenthesesChecker() {
        stackChar = new Stack<>();
    }

    public static boolean checkParentheses(String obj) {


        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('[', ']');
        charMap.put('{', '}');
        charMap.put('<', '>');

        char[] brknChar = obj.toCharArray();
        for (Character character : brknChar) {


            if (charMap.keySet().contains(character) && !stackChar.empty()
                    && stackChar.peek().equals(charMap.get(character))) {
                stackChar.pop();
                return false;

            }  if (stackChar.empty()) {
                stackChar.push(character);
            }

            else {
                stackChar.push(character);
                return false;
            }
        }
        return stackChar.empty();
    }
}



