package stack;

public class Parenthesis {
    //private ArrayStack S1 = new ArrayStack();
    //private ArrayStack S2 = new ArrayStack();

    public Parenthesis() {
    }
    
    public boolean ParenthesisCheck(String string){
        ArrayStack S1 = new ArrayStack();
        ArrayStack S2 = new ArrayStack();
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '('){
                S1.push('(');
                S2.push(i);
            }
            if (string.charAt(i) == ')'){
                if (S1.isEmpty()){
                    System.out.println("Error at position: " + i);
                    return false;
                }
                else{
                    S1.pop();
                    S2.pop();
                }
            }
        }
        if (!S1.isEmpty()){
            System.out.println("Error at position: " +S2.top());
            return false;
        }
        System.out.println("No error");
        return true;
    }
    
    public boolean AdvancedParenthesisCheck(String string){
        ArrayStack S1 = new ArrayStack(100);
        ArrayStack S2 = new ArrayStack(100);
        for (int i = 0; i < string.length(); i++){
            switch (string.charAt(i)) {
                case '(' -> {
                    S1.push('(');
                    S2.push(i);
                }
                case '[' -> {
                    S1.push('[');
                    S2.push(i);
                }
                
                case '{' -> {
                    S1.push('{');
                    S2.push(i);
                }
                
                case ')' -> {
                    if (S1.isEmpty() || !S1.top().equals('(')){
                        System.out.println("Error at position: " + i);
                        return false;
                    }
                    else{
                        S1.pop();
                        S2.pop();
                    }
                }
                case ']' -> {
                    if (S1.isEmpty() || !S1.top().equals('[')){
                        System.out.println("Error at position: " + i);
                        return false;
                    }
                    else{
                        S1.pop();
                        S2.pop();
                    }
                }
                case '}' -> {
                    if (S1.isEmpty() || !S1.top().equals('{')){
                        System.out.println("Error at position: " + i);
                        return false;
                    }
                    else{
                        S1.pop();
                        S2.pop();
                    }
                }
            }
            
        }
        if (!S1.isEmpty()){
            System.out.println("Error at position: " +S2.top());
            return false;
        }
        System.out.println("No error");
        return true;
    }
}
