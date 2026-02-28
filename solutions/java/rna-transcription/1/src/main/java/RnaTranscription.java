class RnaTranscription {
    
    String transcribe(String dnaStrand) {
        int inputLength = dnaStrand.length();
        if(dnaStrand.isEmpty() || inputLength == 0){
            return "";
        }else{
            String transfer = "";
            for(int i=0; i<inputLength; i++){
                char eachChar = dnaStrand.charAt(i);
                if(eachChar == 'G'){
                    transfer += "C";
                }else if(eachChar == 'C'){
                    transfer += "G";
                }else if(eachChar == 'T'){
                    transfer += "A";
                }else{
                    transfer += "U";
                }
            }
            return transfer;
        }
    }

}
