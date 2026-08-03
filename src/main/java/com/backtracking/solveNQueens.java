import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=4;
        List<List<Integer>> result=new ArrayList<>();
        solveNQueens(n,0,new ArrayList<>(),result);
        System.out.println(result.size());
        for(List<Integer> soln:result) {
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(soln.get(i)==j) System.out.print("Q ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println("---------------------");
        }
    }
    public static void solveNQueens(int n,int row,List<Integer> colOps,List<List<Integer>> result) {
        if(row==n) {
            result.add(new ArrayList<>(colOps));
            return;
        }
        for(int i=0;i<n;i++) {
            colOps.add(i);
            if(isValid(colOps)) solveNQueens(n,row+1,colOps,result);
            colOps.remove(colOps.size()-1);
        }
    }
    public static boolean isValid(List<Integer> colOps) {
        int row=colOps.size()-1;
        for(int i=0;i<row;i++) {
            int diff=Math.abs(colOps.get(i)-colOps.get(row));
            if(diff==0 || diff==row-i) return false;
        }
        return true;
    }
}

/**
OUPUT
......................

2
. Q . . 
. . . Q 
Q . . . 
. . Q . 
---------------------
. . Q . 
Q . . . 
. . . Q 
. Q . . 
---------------------

*/
