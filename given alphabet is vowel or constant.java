import java.util.*;
class oddoreven{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Entyer the character:");
        char ch=input.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            ch= Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch +"is vowel");
                }else{
                    System.out.println(ch +" is constant");
                }
                }else{
                    System.out.println(ch+" is not an Alphabet");
                }
                input.close();
            }
    }
    a