package wagonstack;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author seanb
 */
public class MyStack<String> implements StackADT<String>{
    
    private ArrayList<String> stack;
    
    public MyStack(){
        stack = new ArrayList<>();
    }
    
    @Override
    public void push(String item){
        stack.add(item);
    }
    
    @Override
    public String pop(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }else{
            return stack.remove(stack.size() - 1);
             }
    }
    
    @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public int size(){
        return stack.size();
    }
    
    @Override
    public String peek(){
        if(stack.isEmpty()){
           throw new IllegalStateException("Queue is Empty");
        }else{
            return stack.get(stack.size() - 1);
        }
    }
    
    @Override
    public void EmptyAll(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            while(!stack.isEmpty())
                pop();
        }
    }
    
    @Override
    public String displayStack(){
        if(stack.isEmpty()){
            return null;
        } 
        String result = (String) "";
            for(int i=0;i<stack.size();i++){
               result += stack.get(i) + "\n";
            }
        return result;
    }
    
    public String lastIndex(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return stack.get(0);
    }
}
    
   
            
              
