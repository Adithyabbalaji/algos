package com.algos.otherQns;

import java.util.Stack;

public class paranthesesString {
    public int minParanthesesToRemoveToMakeItValid(String s){
        Stack<Character> stack = new Stack<>();
        //lee(t)cod(e))

        char[] charArray = s.toCharArray();
        for(char c: charArray){
            if(!Character.isAlphabetic(c)){
                switch (c) {
                    case '(' -> stack.add(c);
                    case ')' -> {
                        if (!stack.isEmpty() && stack.peek().equals('('))
                            stack.pop();
                        else stack.push(c);
                    }
                }
            }
        }
        return stack.size();
    }
    public int minRemove(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.size();
    }

}
