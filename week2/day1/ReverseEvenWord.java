package week2.day1;

public class ReverseEvenWord {

	static String reverse(String str){
        char ch;
        String s1="";
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            s1 = ch + s1;
        }
        return s1;
    }
    
	public static void main(String[] args) {
    
    String test = "I am a software tester";
    
    String[] s = test.split(" ",5);

    for(int i=0;i<s.length;i++){
        if(i%2 !=0){
            s[i] = reverse(s[i]);
        }
    }
    
    for(int i=0;i<s.length;i++){
        System.out.print(s[i]+" ");
    }

}
}
