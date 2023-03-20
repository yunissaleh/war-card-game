public class Play {

    public static void main(String[] args) {
        WarGame w = new WarGame();
        int meanNum = 0;
        int[] games = new int[10];

        for(int i = 0; i < 10; i++) {
            games[i] = w.createGame();
        }

        int min = games[0];
        int max = games[0];

        for(int i = 1; i < 10; i++) {
            if(games[i] > max) {
                max = games[i];
            }
        }
        for(int i = 1; i < 10; i++) {
            if(games[i] < min) {
                min = games[i];
            }
        }

        for(int i = 0; i < 10; i++) {
            meanNum += games[i];
        }
        System.out.println("MeanNum: " + meanNum/10);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}

