class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            } 
            
            if (stack.size() > 0) {
                char top = stack.peek();

                if (top == ')' || top == '}' || top == ']' ) {
                    return false;
                }

                if (ch == ')' && top == '(') {
                    stack.pop();
                } else if (ch == '}' && top == '{') {
                    stack.pop();
                } else if (ch == ']' && top == '['){
                    stack.pop();
                } else {
                   stack.push(ch); 
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.size() == 0;
    }
}
