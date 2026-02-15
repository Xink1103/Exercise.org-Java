class ReverseString {

    String reverse(String inputString) {
        String output = "";
        for(int i=inputString.trim().length()-1 ; i>=0 ; i--){
            char newChar  = inputString.charAt(i);
            output += newChar;
        }
        return output;
    }
  
}
