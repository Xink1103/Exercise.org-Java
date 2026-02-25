import java.util.*;

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
        
        List<Integer> descOrderList = 
        new ArrayList<>(scores);
            
        descOrderList.sort(Comparator.reverseOrder());
        
        int descOrderLength = descOrderList.size();
        
        List<Integer> topThreeList = new ArrayList<>();
        
        if(descOrderLength == 1){
            Integer firstScores = descOrderList.get(0); 
            topThreeList.add(firstScores);
        }else if(descOrderLength == 2){
            Integer firstScores = descOrderList.get(0);
            Integer secondScores = descOrderList.get(1);
            topThreeList.add(firstScores);
            topThreeList.add(secondScores);
        }else{
            Integer firstScores = descOrderList.get(0);
            Integer secondScores = descOrderList.get(1);
            Integer thirdScores = descOrderList.get(2);
            topThreeList.add(firstScores);
            topThreeList.add(secondScores);
            topThreeList.add(thirdScores);
        }
        
        return topThreeList;
        
    }

}
