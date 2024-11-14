import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class BalanceParens {
    public static void main(String[] args) {
        ArrayList<String> expressions = new ArrayList<String>();
        expressions.add( "(((())))");
        expressions.add( "(((()))");
        expressions.add( "((())))");
        for( String exp : expressions ){
            if ( gotBalancedParem( exp)){
                System.out.printf("\n Yes:%s is balanced\n", exp);
            } else {
                System.out.printf("\n NO:%s is Not balanced\n", exp);
            }
        }
    }

    private static boolean gotBalancedParem(String exp) {
        boolean isBalanced = true;
        Deque<Character> stack = new ArrayDeque<Character>();
        for( int i = 0; i < exp.length(); i++ ){
            char ch = exp.charAt(i);
            if( ch == '('){
                stack.push(ch);
            } else if( ch == ')'){
                if( stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        if ( stack.size() > 0 ) {
            return false;
        }
        return isBalanced;
    }
}
