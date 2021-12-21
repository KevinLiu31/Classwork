public class StringToInt{
  public static int stringToInt(String s){
    int ans = 0;
     if ((s.substring(0, 1)).equals("-")){
       boolean neg = true;
       s = s.substring(1);
     }
     for(int x = 0; x < s.length(); x++){
       ans += valueOfDigit(s.charAt(x) * (Math.pow(10, x)));
     }
     if(neg){
       ans = ans * -1;
     }
     return ans;
   }
  public static int valueOfDigit(char c){
    return ((int)(c)) - 48;
  }
  public static void main(String[] args) {
    System.out.println(valueOfDigit('1' ));
    System.out.println(valueOfDigit('9' ));
    System.out.println(valueOfDigit('8'));

  }
}
