import java.util.Stack;

public class Practice {

    // class Node{
    // int data;
    // Node next;
    // Node(int data){
    // this.data=data;
    // }
    // }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    public static void infixtopostfix(String exp) {
        String str = "";

        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
        
        char c= exp.charAt(i);
        System.out.println(c);
    }

    }

    public static void main(String Args[]) {
        // *****
        // ****
        // ***
        // **

        // String str="";
        // for(int i=0;i<=3;i++){

        // for(int k=0;k<i;k++){
        // str+=" ";
        // }

        // for(int j=5;j>i;j--){
        // str+="*";
        // }
        // str+="\n";
        // }
        // System.out.println(str);
        // }


String str="abcd";

infixtopostfix(str);


    }

}
