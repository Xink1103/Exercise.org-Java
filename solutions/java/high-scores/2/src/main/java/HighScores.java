import java.util.*;
import java.util.stream.*;

class HighScores {

    private List<Integer> scores;
    
    public HighScores(List<Integer> highScores) {
        scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        int scoresLength = scores.size();
        return scores.get(scoresLength-1);
    }

    Integer personalBest() {
        List<Integer> descOrderList = 
        new ArrayList<>(scores);
           
        descOrderList.sort(Comparator.reverseOrder());
        return descOrderList.get(0);
    }

    List<Integer> personalTopThree() {
        
        return scores.stream()
                     .sorted(Comparator.reverseOrder())
                     .limit(3)
                     .collect(Collectors.toList());
    }

}
