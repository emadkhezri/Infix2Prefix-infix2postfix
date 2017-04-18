
package calculator;

import javax.swing.JOptionPane;

public class Stack {
    private StackElement stck[] = new StackElement[100];
    private int tos;
    
    Stack(){//Stack Constraction method
        tos=-1;
    }
    
    boolean isEmpty(){//Check whether or not Stack is Empty
        return(tos==-1);
    }
    
    boolean isFull(){//Check whether or not Stack is Full
        return(tos==99);
    }
    
    void push(StackElement SE){
        try{
            if(tos==99)
                throw new ArithmeticException("Stack is full!");//Stack is full
            else{
                stck[++tos]=SE;
            }
        }
        catch(ArithmeticException exp){
            JOptionPane.showMessageDialog(null, exp);
            throw new ArithmeticException("Stack is full!");//Stack is full
        }
    }//Push into the Stack
    
    StackElement pop(){//Pop from Stack
        try{
            if(tos<0)
                throw new ArithmeticException("Stack is empty!");
            else
                return stck[tos--];
        }
        catch(ArithmeticException exp){
            JOptionPane.showMessageDialog(null, exp);
            throw new ArithmeticException("Stack is empty!");
        }
    }
    
    StackElement top(){//Return the top element of Stack
        if(isEmpty())
            throw new ArithmeticException("Stack is empty!");
        else
            return stck[tos];
    }
}

