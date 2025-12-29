import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CheckBalance {
    public static void main(String[] args) {
        ArrayList<String> expressions = new ArrayList<>();
        expressions.add("(1+2)*3");
        expressions.add("(1+3(*4");
        expressions.add("(1+3(4*5))");
        expressions.add(")(1+3(4*5))");
        expressions.add("(1+3(4*5))(");
        expressions.add("2+2");
        for( String exp : expressions){
            System.out.printf("\n Got Balanced for:%s Balanced:%s",
                    exp, checkBalance2( exp ));
        }
    }

    private static boolean checkBalance(String exp) {
        Deque<Character> stack = new ArrayDeque<>();
        boolean balanced = false;
        for (int i=0; i<exp.length(); i++) {
            char currCh = exp.charAt(i);
            if (currCh == '(') {
                stack.push(currCh);
            } else if (currCh == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                } else {
                    balanced = true;
                }
            }
        }
        if ( !stack.isEmpty()){
            balanced = false;
        }
        return  balanced;
    }
    private static boolean checkBalance2(String exp) {
        if(exp == null) {return false;}
        Deque<Character> stack = new ArrayDeque<>();
//        boolean balanced = false;
        for (int i = 0; i < exp.length(); i++) {
            char curr = exp.charAt(i);
            if (curr == '(') {
                stack.push(curr);
            } else if (curr == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
