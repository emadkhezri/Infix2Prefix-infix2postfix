/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author EMAD
 */
public class Expression {
    private String InfixExp;//Infix Expression
    private String PostfixExp;//Postfix Expression
    private String PrefixExpo;//Prefix Expression
    private int LengthExp;//Length of Expression
    
    Expression(){
        LengthExp = 0;
        InfixExp=new String();
        PrefixExpo=new String();
        PrefixExpo=new String();
                
    }
 
 // Get Functions
 // Begin
    public int getLengthExp(){
        return LengthExp;//Return Length of Expression
    }

    public String getInfix(){
        return InfixExp;//Return Infix Expression
    }
    
    public String getPrefix(){
        return PrefixExpo;//Return Prefix Expression
    }
    
    public String getPostfix(){
        return PostfixExp;//Return Postfix Expression
    }

// End
    
// Set Functions
// Begin
    
    public void setInfix(String Input,int length){
        InfixExp = Input;
        LengthExp = length;
    }
    
    public void setPostfix(String Input){
        PostfixExp = Input;
    }
    
    public void setPrefix(String Input){
        PrefixExpo = Input;
    }
    
// End      
    
    private StackElement ReadTokens(int start,String input){//Read 1 token frome Input String
        
        StackElement result=new StackElement();

        try{
            while(input.charAt(start) == ' '){
                start++; 
            }
        
            //if the index is end of string we can't check next index
            //becouse it's outof bound
            //begin
        if(start == input.length()-1 && (input.charAt(start)==')')){
            result.Str = input.substring(start);
            result.priorty = 5;
            result.end = start+1;
        } 
        
        else if(start == input.length()-1 && (input.charAt(start) >= '0' && input.charAt(start) <= '9')){
            result.Str = input.substring(start);
            result.priorty = 0;
            result.end = ++start;
        }
        
        else if(input.substring(start,start+1).equals("(")||input.substring(start,start+1).equals(")")){
            result.Str = input.substring(start,start+1);
            result.priorty = 5;
            result.end = start+1;
        }
        
        else if('0'<=input.substring(start,start+1).charAt(0) && 
                input.substring(start,start+1).charAt(0) <='9'){
            String number=new String();
            do{
                number=number.concat(input.substring(start,start+1));
                start++;
                if(start == input.length()-1){
                    if((input.charAt(start) >= '0' && input.charAt(start) <= '9')){
                        number=number.concat(input.substring(start));
                        start++;    
                    }
                    break;   
                }
            }
            while(('0' <= input.substring(start,start+1).charAt(0)) &&
                    (input.substring(start,start+1).charAt(0) <= '9' && start < input.length()-1)
                    || (input.substring(start,start+1).charAt(0)) == '.' );
            result.Str = number;
            result.priorty = 1;
            result.end = start;
        }                    
        else if(input.substring(start,start+1).equals("^")||input.substring(start,start+1).equals("*")
                ||(input.substring(start,start+1).equals("/"))||
                (input.substring(start,start+1).equals("%"))){
            
            result.Str = input.substring(start,start+1);
            result.priorty = 3;
            result.end = start+1;
        }
        
        else if(input.substring(start,start+1).equals("+")||input.substring(start,start+1).equals("-")){
            result.Str = input.substring(start,start+1);
            result.priorty = 2;
            result.end = start+1;           
        }
        
        else if(input.substring(start,start+3).equals("sin")||input.substring(start,start+3).equals("cos")
                ||(input.substring(start,start+3).equals("tan"))||(input.substring(start,start+3).equals("cot"))
                ||(input.substring(start,start+4).equals("sqrt"))){
                    result.Str = input.substring(start,start+3);
                    result.priorty = 4;
                    result.end = start+3;  
                }  
        else
            throw new ArithmeticException("error");
        }
        catch(StringIndexOutOfBoundsException | ArithmeticException exp1){
            JOptionPane.showMessageDialog(null,"invalid infix expression!"+"\n"+exp1.getLocalizedMessage());
        }
        return result;
    }
    
    public String convert(String input){//Convert Input String to postfix form
        Stack myStack=new Stack();
        int s=0;//start of infix expression
        String output=new String();
        StackElement temp;
        try{
            while(s < input.length()){
                temp = ReadTokens(s,input);
                if(temp.Str.charAt(0) >= '0' && temp.Str.charAt(0) <= '9'){
                 output=output.concat(temp.Str); 
                 output=output.concat(" "); 
                }
                else if(!temp.Str.equals(")"))
                {
                    if(myStack.isEmpty())
                        myStack.push(temp);
                    else{
                        while(!myStack.isEmpty())
                        {
                            if(myStack.top().priorty >= temp.priorty &&
                                !((myStack.top().Str.equals(myStack.top().Str))
                                &&(myStack.top().Str.equals("^")))
                                &&!(myStack.top().Str.equals("(")))
                            {
                                output=output.concat(myStack.pop().Str);
                                output=output.concat(" ");
                            }
                            else
                                break;
                        }
                        myStack.push(temp);
                    }
                }
                else if(temp.Str.equals(")")){
                    String temp1;
                    do{
                        temp1=myStack.top().Str;
                        if(temp1.equals("(")){
                            myStack.pop();
                            break;
                        }
                        output=output.concat(myStack.pop().Str);
                        output=output.concat(" "); 
                    }while(true);
                }
               s=temp.end;
            }
            while(!myStack.isEmpty())
            {
                if(!(myStack.top().Str.equals("("))){
                    output=output.concat(myStack.pop().Str);
                    output=output.concat(" ");  
                }
                else
                    myStack.pop();
            }
            if(output.length()>0)
                output=output.substring(0,output.length()-1);
            return output;
        }
        catch(ArrayIndexOutOfBoundsException exp1){
            JOptionPane.showMessageDialog(null, exp1);
            return null;
        }
        catch(ArithmeticException exp2){
        JOptionPane.showMessageDialog(null, "Invalid Infix expression");
        return null;
    }
    }
    
    public String ReverseExpression(String input){//Reverse input Expression
        int s=0;
        String TempString=new String();
        StackElement TempElement;
        Stack TempStack=new Stack();
        while(s < input.length()){
            TempElement = ReadTokens(s,input);
            if(TempElement.Str.equals("("))
                TempElement.Str=")";
            else if(TempElement.Str.equals(")"))
                TempElement.Str="(";
            TempStack.push(TempElement);
            s=TempElement.end;
        }
        while(!TempStack.isEmpty()){
         TempString=TempString.concat(TempStack.pop().Str);
         TempString=TempString.concat(" ");
        } 
        if(TempString.length()>0)
            TempString=TempString.substring(0, TempString.length()-1);
        return TempString; 
    }
    
    public double CalculatePostfix(String input){//Calculate the answer base on Postfix Expression
        int s=0;//Start of input string
        StackElement TempElement;
        double x;
        Stack TempStack=new Stack();
        try{
                    while(s < input.length()){
            TempElement = ReadTokens(s, input);
            s=TempElement.end;
            if(TempElement.Str.charAt(0) >= '0' 
                    && TempElement.Str.charAt(0) <= '9' ){
                TempStack.push(TempElement);
            }
            else{
                StackElement Temp2;
                switch(FunctionNumber(TempElement)){
                    case 1:{//Sinoos
                        TempElement = TempStack.pop();
                        x = Math.sin(Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }
                    case 2:{//Cosinoos
                        TempElement = TempStack.pop();
                        x = Math.cos(Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   } 
                    case 3:{//Tanjant
                        TempElement = TempStack.pop();
                        x = Math.tan(Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }
                    case 4:{//Cotanjant
                        TempElement = TempStack.pop();
                        x = 1 / Math.tan(Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }    
                    case 5:{//Square
                        TempElement = TempStack.pop();
                        x = Math.sqrt(Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }
                    case 6:{//Power
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x = Math.pow(Double.valueOf(Temp2.Str),Double.valueOf(TempElement.Str));
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }
                    case 7:{//Reminder
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x =Double.valueOf(Temp2.Str) % Double.valueOf(TempElement.Str);
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }                         
                    case 8:{ //Multiply
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x =Double.valueOf(Temp2.Str) * Double.valueOf(TempElement.Str);
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }  
                    case 9:{ //Divide
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x =Double.valueOf(Temp2.Str) / Double.valueOf(TempElement.Str);
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }    
                    case 10:{ //Add
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x =Double.valueOf(Temp2.Str) + Double.valueOf(TempElement.Str);
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }    
                    case 11:{ //Sub
                        TempElement = TempStack.pop();
                        Temp2 = TempStack.pop();
                        x =Double.valueOf(Temp2.Str) - Double.valueOf(TempElement.Str);
                        TempElement.Str = String.valueOf(x);
                        TempStack.push(TempElement);
                        break;
                   }
                    default:
                        throw new ArithmeticException("Can't calculates the expression");
            }
        }
        }
        TempElement = TempStack.pop();
        x = Double.valueOf(TempElement.Str);
        if(TempStack.isEmpty()){
            return x;
        }
        else{
            throw new ArithmeticException();
        }
        }
        catch(ArithmeticException exp){
            JOptionPane.showMessageDialog(null,"Can't calculates the result!\nEnter correct infix expression");
            return 0;
        }    
    }
    
    //Return a value depends on functionality
    // Sin       1
    // cos       2
    // tan       3
    // cot       4    
    // sqr       5
    // ^         6
    // %         7
    // *       8
    // /       9
    // +       10
    // -       11
    private int FunctionNumber(StackElement SE){
        try{
            switch(SE.Str){
                case "sin":
                    return 1;
                case "cos":
                    return 2;
                case "tan":
                    return 3;
                case "cot":
                    return 4;
                case "sqr":
                    return 5;
                case "^":
                    return 6;
                case "%":
                    return 7;
                case "*":
                    return 8;
                case "/":
                    return 9;
                case "+":
                    return 10;
                case "-":
                    return 11;
                default:{
                    throw new ArithmeticException("Can't Calculate the Expression");
                }
            }    
        }
        catch(ArithmeticException exp){
            JOptionPane.showMessageDialog(null, exp);
            return -1;
        }
    }
    
    
}


