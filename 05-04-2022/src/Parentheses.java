/*
Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct.
Try to solve it yourself without help of Google
“9*(8+3)-( (9+1)5)” -> true
“9(8+3)- (9+1)5)” -> false
“98+3)-( (9+1)*5” -> false
 */
public class Parentheses {
        public static void main(String[] args) {
            System.out.println("\"9*(8+3)-( (9+1)5)\" -> "+Parentheses("9*(8+3)-( (9+1)5)"));
            System.out.println("\"9(8+3)- (9+1)5)\" -> "+Parentheses("9(8+3)- (9+1)5)"));
            System.out.println("\"98+3)-( (9+1)*5\" -> "+Parentheses("98+3)-( (9+1)*5"));
        }
        public static Boolean Parentheses(String str) {
            boolean result=false;
            int parenthesOpenCounter = 0;
            int parenthesClosedCounter = 0;
            for (int i = 0; i < str.length(); i++) {
                char currentSymbol = str.charAt(i);
                if(currentSymbol=='('){
                    parenthesOpenCounter = parenthesOpenCounter + 1;
                }
                if(currentSymbol==')'){
                    parenthesClosedCounter = parenthesClosedCounter + 1;
                }
            }
            if (parenthesOpenCounter-parenthesClosedCounter==0){
                result=true;
            }
            return result;
        }
    }
