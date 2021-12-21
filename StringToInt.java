public class StringToInt{
  public static int valueOfDigit(char c){
    return ((int)(c)) - 48;
  }
  public static void main(String[] args) {
    System.out.println(valueOfDigit('1' ));
    System.out.println(valueOfDigit('9' ));
    System.out.println(valueOfDigit('8'));

  }
}
