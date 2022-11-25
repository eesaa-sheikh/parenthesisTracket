import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesesChecker {
    ////////////////////////////////work
    static Stack<Character> stackChar;

    public ParenthesesChecker() {
        stackChar = new Stack<>();
    }

    public boolean checkParentheses(String obj) {
        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('[', ']');
        charMap.put('{', '}');
        charMap.put('<', '>');

        char [] brkn = obj.toCharArray();

            for (Character c : brkn ){
            if (charMap.keySet().contains(c)) {
                stackChar.push(c);
            }
            if (stackChar.empty()) return false;

            char test;
            switch (c) {
                case (')'): {
                    test = stackChar.pop();
                    if (test == '{' || test == '[' || test == '<')
                        return false;
                    break;
                }
            }
        }
        return stackChar.empty() && true;
    }
}













//
//
//            }
//            if (charMap.keySet().contains(character) && !stackChar.empty()
//                    && stackChar.peek().equals(charMap.get(character))) {
//                stackChar.pop();
//                return false;
//
//            }  if (stackChar.empty()) {
//                stackChar.push(character);
//                return false;
//            }
//
//            else {
//                stackChar.push(character);
//                return false;
//            }
//        }
//        return stackChar.empty();
//    }
//}
//
//
//
