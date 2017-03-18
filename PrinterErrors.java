public class Printer {
    
  public static String printerError(String s) {
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
      String test = Character.toString(s.charAt(i));
      if(!(test.matches("[a-m]"))) {
        count+=1;
      } 
    }
    return count +"/"+ s.length();
  }
}