class Acronym {

    private String acronym = "";
    
    Acronym(String phrase) {
        String newPhrase = phrase.replaceAll("_"," ").trim().toUpperCase();
        String[] wordsAfterSplit = newPhrase.split("[ -]+");
        for(String words : wordsAfterSplit){
            acronym += words.substring(0,1);
        }
    }

    String get() {
        return acronym;
    }

}
