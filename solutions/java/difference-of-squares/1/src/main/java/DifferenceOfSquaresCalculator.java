class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for(int i=1; i<=input; i++){
            sum += i;
        }
        int squareOfSum = 0;
        squareOfSum =(int)Math.pow(sum,2);
        return squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for(int i=1; i<=input; i++){
            sumOfSquares += (int)Math.pow(i,2);
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo( input);
    }

}
