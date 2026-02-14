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
       return collections.get(0)
                         .stream()
                         .filter(target -> collections.stream()
                                                      .allMatch(set -> set.contains(target)))
                         .collect(Collectors.toSet());
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream()
                          .flatMap(set -> set.stream())
                          .collect(Collectors.toSet());
    }
}
