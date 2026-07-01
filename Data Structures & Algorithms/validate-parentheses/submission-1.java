class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() > 0 && ((stack.peek() == '(' && c == ')') 
                || (stack.peek() == '{' && c == '}') 
                || (stack.peek() == '[' && c == ']'))) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.size() == 0 ? true : false;
    }
}
