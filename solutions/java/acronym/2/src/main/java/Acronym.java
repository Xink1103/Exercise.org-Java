class Acronym {
    private StringBuilder acronym = new StringBuilder();
    
    Acronym(String phrase) {
        String newPhrase = phrase.replaceAll("_"," ").trim().toUpperCase();
        String[] wordsAfterSplit = newPhrase.split("[ -]+");
        for(String word : wordsAfterSplit){
            acronym.append(word.substring(0,1));
        }
    }

    String get() {
        return acronym.toString();
    }

}
