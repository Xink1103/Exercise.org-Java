import java.util.*;
import java.util.stream.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return cards.stream().collect(Collectors.toSet());
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
       boolean youCanTradeMe = 
               !theirCollection.containsAll(myCollection);
       boolean iCanTradeYou = 
               !myCollection.containsAll(theirCollection);
       return  youCanTradeMe && iCanTradeYou;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> firstPersonCollections = collections.get(0);
        Set<String> commonCardsCollections = new HashSet<>();
        boolean rule = false;
        
        for(String cards : firstPersonCollections){
            for(Set<String> set : collections){
                if(set.contains(cards)){
                    rule = true;
                    continue;
                }else{
                    rule = false;
                    break;
                }
            }
            if(rule){
                commonCardsCollections.add(cards);
            }
        }
        return commonCardsCollections;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardSet = new HashSet<>();
        for(Set<String> set : collections){
            allCardSet.addAll(set);
        }
        return allCardSet;
    }
}
