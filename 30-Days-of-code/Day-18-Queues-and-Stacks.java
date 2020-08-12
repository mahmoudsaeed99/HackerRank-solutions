

public class Solution {
    // Write your code here.
    Stack<Character> s = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();
    public void pushCharacter(char c){
            s.push(c);
    }
    public char popCharacter(){
        return s.pop();
    }
    public void enqueueCharacter(char c){
            q.add(c);
    }
    public char dequeueCharacter(){
        return q.remove();   
    }
