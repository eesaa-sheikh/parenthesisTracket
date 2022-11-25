//import java.util.Stack;
//import java.util.HashMap;
//
//public class T {
//    ////////////////////////////////work
//    private static Stack<Character> stackChar;
//    public ParenthesesChecker() {
//        stackChar = new Stack<>();
//    }
//        public static boolean pots (String obj){
//            char[] brknChar = obj.toCharArray();
//            HashMap<Character, Character> characterHashMap = new HashMap<>();
//            characterHashMap.put('(', ')');
//            characterHashMap.put('[', ']');
//            characterHashMap.put('{', '}');
//            characterHashMap.put('<', '>');
//
//            for (Character val : brknChar) {
//                if (characterHashMap.containsKey(val) &&
//                        characterHashMap.containsValue(val)) {
//                    stackChar.push(val);
//                } else if (characterHashMap.containsKey(val) &&
//                        characterHashMap.containsValue(val)) {
//                    if (characterHashMap.get(stackChar.peek()).equals(val)
//                            && !stackChar.isEmpty()) {
//                        stackChar.pop();
//                    }
//                }
//            }
//            return stackChar.isEmpty();
//
//        }
//    }
