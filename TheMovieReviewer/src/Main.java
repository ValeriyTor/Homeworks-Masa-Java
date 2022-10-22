public class Main {
    public static void main(String[] args) {
        boolean testGetRating1 = false;
        boolean testFavourite = false;

/**   This array is just an example of some movies --
 *    it doesn't actually get used.
 *
 *    String[] movies = {"The Matrix", "ET", "Slumdog Millionaire",
 *            "Le Rayon Vert", "Mamma Mia"};
 */

        Reviewer1 r1 = new Reviewer1();

        // setRating1(i, j) -- assign the value j
        // to the movie corresponding to index i
        r1.setRating1(0, 3);
        r1.setRating1(1, 4);
        r1.setRating1(2, 5);
        r1.setRating1(3, 2);
        r1.setRating1(4, 1);

        // Run some tests.
        if (r1.getRating1(1) == 4) {
            testGetRating1 = true;
        }

        if (r1.favourite1() == 2) {
            testFavourite = true;
        }

        System.out.println("testGetRating1: " + testGetRating1);
        System.out.println("testFavourite: " + testFavourite);
    }
}

class Reviewer1 {

    /**
     * Assume there are exactly 5 films that need to be rated.
     */
    int[] ratings = new int[5];
    public void setRating1(int movieIndex, int rating) {
        // TODO: implement method stub
        this.ratings[movieIndex] = rating;
    }

    public int getRating1(int movieIndex) {
        // TODO: implement method stub
        return this.ratings[movieIndex];
    }

    /**
     * Return the index of the film which gets the highest rating.
     */
    public int favourite1() {
        // TODO: implement method stub
        int i = 0;
        for (int count = 1 ; count < this.ratings.length; count++ ) {
            if (this.ratings[count - 1] <= this.ratings[count])
                i = count;
        }
        return i;
    }
}

