/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionvalidation;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Peter
 */
public class ExpressionValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Program Init
        Scanner sc = new Scanner(System.in);
        Stack<Character> expStack = new Stack<>();

        System.out.println("Welcome to the expression validating program.\n");     

        System.out.println("Enter your expression:");
        String expression = sc.nextLine();

        System.out.println("Enter the opening character to validate:");
        char expStartChar = sc.next().charAt(0);

        System.out.println("Enter the closing character to validate:");
        char expCloseChar = sc.next().charAt(0);
        
        boolean tooManyClosing = false;
        
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == expStartChar){
                expStack.push(expression.charAt(i));
            } else if (expression.charAt(i) == expCloseChar){
                if (!expStack.isEmpty()){
                    expStack.pop();
                } else {
                    tooManyClosing = true;
                    break;
                }
            }
            
        }
        
        if (expStack.isEmpty() && tooManyClosing != true){
            System.out.println("The expression is validated");
        } else {
            System.out.println("The expression is incorrect");
        }

        
    }
    
    
    
}
