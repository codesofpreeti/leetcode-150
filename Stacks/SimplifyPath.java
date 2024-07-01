package Stacks;

import java.util.Stack;
// Given an absolute path for a Unix-style file system, which begins with a slash '/', transform this path into its simplified canonical path.
public class SimplifyPath {
    public String SimplifyPath(String path){
        Stack<String> s= new Stack<>();
        StringBuilder res= new StringBuilder();
        int p[]=path.split("/");
        
        for(int i=0;i<p.length;i++){
            if(!s.isEmpty() && p.equals("..")){
                s.pop();
            }
            else if(!p[i].equals()||!p[i].equals(".")|| !p[i].equals("..")){
                s.push(p[i]);
            }
        }
        if(s.isEmpty()){
            return "/";
        }
        while(!s.isEmpty()){
            res.insert(0,s.pop()).insert(0, '/');
        }
        return res.toString();
    }
}
