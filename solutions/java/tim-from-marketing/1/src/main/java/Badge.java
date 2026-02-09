class Badge {
    public String print(Integer id, String name, String department) {
        String text1 = "";
        String text2 = "";
        String text3 = "";
        
        if(id == null){
            text1 = "";
        }else{
            text1 = "["+String.valueOf(id)+"] - ";
        }
        
        text2 = name + " - ";
        
        if(department != null){
            text3 = department.toUpperCase();
        }else{
            text3 = "OWNER";
        }
        
        return text1+text2+text3;
        
    }
}
