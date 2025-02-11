/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wagonstack;

/**
 *
 * @author seanb
 */
public interface StackADT<String> {
    
    void push(String item);
    String pop();
    boolean isEmpty();
    int size();
    String peek();
    void EmptyAll();
    String displayStack();
}
