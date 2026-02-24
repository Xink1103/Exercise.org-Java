import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger calculateGrains = BigInteger.valueOf(2);
        if(square<=0 || square>64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }else{
            return calculateGrains.pow(square-1);
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrands = BigInteger.ZERO;
        for(int i=1; i<=64; i++){
            totalGrands =
            totalGrands.add(grainsOnSquare(i));
        }
        return totalGrands;
    }

}
