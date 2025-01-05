public class topLists
{
    public static void main (String args[])
    {
        new topLists ();
    }
    public topLists ()
    {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println ("My Favourite digits");
        for (int i = 0 ; i < digits.length ; i++)
            System.out.println ((i + 1) + ". " + digits [i]); // The 'i' is the specific index used, changes with every loop.
        System.out.println ();

        String[] months = {"November", "January", "February", "March", "April", "May", "June", "July", "August" ,"September" , "October", "December"};
        System.out.println("My Favourite Months in order");
        for (int i = 0; i < months.length; i++)
            System.out.println((i + 1) + ". " + months[i]);
        System.out.println();

        String[] college = {"Waterloo", "UofT", "UBC", "McGill", "Ryerson/TMU", "McMaster", "Brock"};
        System.out.println("The colleges/universities I've considered");
        for (int i = 0; i < college.length; i++)
            System.out.println((i + 1) + ". " + college[i]);
        System.out.println();

        System.out.println("Recent movies I've watched");
        String[] recentMovies = {"Back to the Future", "Sonic 3", "Home Alone 1", "Home Alone 2", "Interstellar", "1917", "Dunkirk", "Drive"};
        System.out.println("Recent movies I've watched, recent to least recent");
        for (int i = 0; i < recentMovies.length; i++)
            System.out.println((i + 1) + ". " + recentMovies[i]);
        System.out.println();

        System.out.println("Games I like");
        String[] games = {"Minecraft", "Chess", "Counter Strike", "Uno", "Monopoly", "Connect 4", "Portal", "Portal 2", "Tic Tac Toe", "Half Life"}; // I just did all types of games
        for (int i = 0; i < games.length; i++)
            System.out.println((i + 1) + ". " + games[i]);
        System.out.println();

        System.out.println("Books I like");
        String[] books = {"Quran", "The Travels of Ibn Battuta", "1984", "Night", "Five Little Indians"};
        for (int i = 0; i < books.length; i ++)
            System.out.println((i + 1) + ". " + books[i]);
        System.out.println();

        System.out.println("Colours ranked from worst to best");
        String[] colours = {"Blue", "Green", "Red", "Yellow", "Pink"};
        for (int i = 0; i < colours.length; i++)
            System.out.println((i + 1) + ". " + colours[i]);
        System.out.println();

        System.out.println("Musicians I like ranked from most to least liked");
        String[] musicians = {"The Smiths", "Mac DeMarco", "Tame Impala", "Eyedress", "Mitski"};
        for (int i = 0; i < musicians.length; i++)
            System.out.println((i + 1) + ". " + musicians[i]);
        System.out.println();

        System.out.println("My HUMBLE characteristics");
        String[] characteristics = {"Humble", "Honest", "Reasonable"}; // as you can see im EXTREMELY humble
        for (int i = 0; i < characteristics.length; i++)
            System.out.println((i + 1) + ". " + characteristics[i]);
        System.out.println();
    }
}
