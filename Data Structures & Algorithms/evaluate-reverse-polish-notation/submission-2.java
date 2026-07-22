class Solution {
    public int evalRPN(String[] tokens) {
        // using stack;
        String operator = "+-*/";
        Stack<String>st = new Stack<>();
        for(String token : tokens)
        {
            if(operator.contains(token)) // 
                {
                    int b = Integer.parseInt(st.pop());
                    int a = Integer.parseInt(st.pop());
                    
                    int result = 0;

                    if(token.equals("+"))
                    {
                       result = a+b;
                    }
                  else  if(token.equals("-"))
                    {
                        result = a-b;
                    }
                   else if(token.equals("*"))
                    {
                        result = a*b;
                    }
                    else
                    {
                        result = a/b;
                    }
                    st.push(String.valueOf(result));
                }
                else
                st.push(token);
        }
        String ans = st.peek();
        return Integer.parseInt(ans);
    }
}
