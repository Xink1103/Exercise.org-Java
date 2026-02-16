class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberTrans = String.valueOf(numberToCheck);
        int sum = 0 ;
        for(int i = numberTrans.length()-1 ; i>=0 ; i--){
            char unit = numberTrans.charAt(i);
            String charToString = String.valueOf(unit);
            int numberToCal = Integer.valueOf(charToString);
            sum += (int)Math.pow(numberToCal,numberTrans.length());
        }
        return sum == numberToCheck ? true : false;
    }

}
