import java.util.*;

public class DialingCodes {

    private Map<Integer,String> dialingCodes;

    public DialingCodes(){
        super();
        dialingCodes = new HashMap<>(); 
    }

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code,country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if( !dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)  ){
            dialingCodes.put(code,country);
        }else{
            return;
        }
    }

    public Integer findDialingCode(String country) {
        for(Integer key : dialingCodes.keySet()){
            if(country.equals(dialingCodes.get(key))){
                return key;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(dialingCodes.containsValue(country)){
            int oldNumber = findDialingCode(country);
            dialingCodes.remove(oldNumber);
            dialingCodes.put(code,country);
        }else{
            return;
        }
    }
}
