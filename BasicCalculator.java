class Basic Calculator {
    public int calculate(String s) {
        Stack<Integer> stack = new stack<>();
        int number =0;
        char operator ='+';
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }    
            if(!Character.isDigit(ch) && ch != ' ' || i == s.length() -1){
                switch(operator) {
                       case '+':
                           stack.push(number);
                           break;

                       case'-':
                           stack.push(-number);
                           break;

                       case'*':
                           stack.push(stack.pop() * number);
                           break;

                       case'/':
                           stack.push(stack.pop()/number);
                           break;
                     }
                 operator = c;
                 number = 0;
}
}
int result =0;
while(0)
        
    }
}
