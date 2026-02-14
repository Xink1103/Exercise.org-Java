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
        Set<String> commonCardsCollections 
        = new HashSet<>(collections.get(0));
        
        for(Set<String> set : collections){
            commonCardsCollections.retainAll(set);    
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
