public class CarsAssemble {

    private int carPerHour = 221;
    private double carPerMins = 221.0/60.0;
    
    public double productionRatePerHour(int speed) {
        if( 1 <= speed && speed <= 4){
            return carPerHour * speed;
        }else if( 5<= speed && speed <= 8 ){
            return carPerHour * speed * 0.9 ;
        }else if( speed == 9 ){
            return carPerHour * speed * 0.8;
        }else if( speed >= 10 ){
            return carPerHour *speed * 0.77;
        }else{
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
       return (int)(productionRatePerHour(speed)/(60.0));
    }
}
