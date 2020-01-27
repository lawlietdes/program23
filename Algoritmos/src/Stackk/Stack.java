package Stackk;

public class Stack {
	
	private int size;
	private char arrayStack[];
	private int top;
	
	public Stack(int size) {
		this.size=size;
		this.arrayStack=new char [this.size];
		this.top=-1;
	}
	public Stack() {
		
	}
	public void push(char caracter){
		top++;
		arrayStack[top]=caracter;
	}
	public char pop() {
		int top_old=top;
		top--;
		return arrayStack[top_old]; 
	}
	public long peak() {
		return arrayStack[top];
	}
	public boolean isFull() {
		return (size-1==top);
	}
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void getEmptyStack(Stack pila) {
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
	public Stack arrayToStack(char array[]) {
		Stack pila=new Stack(array.length);
		for(int i =0; i <array.length; i++) {
			pila.push(array[i]);
		}
		return pila;
	}

}
