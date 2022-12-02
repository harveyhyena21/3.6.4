/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms {
  public static void main(String[] args) {
    int[] goals = { 1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2 };

    int sum = 0;
    int max = goals[0];
    int min = goals[0];
    int[] goalCounter = new int[10];

    // finding sum of array
    for (int i = 0; i < goals.length; i++)
      sum += goals[i];

    // finding min and max of array
    for (int i = 1; i < goals.length; i++) {
      if (max < goals[i])
        max = goals[i];
      if (min > goals[i])
        min = goals[i];
    }

    // finding mode of an array
    // the condition of the this algorithm is that the integers in the array must
    // be 0 or positive integers
    for (int i = 0; i < goals.length; i++) {
      goalCounter[goals[i]]++;
    }
    int maxCounter = goalCounter[0];
    for (int i = 0; i < goalCounter.length; i++) {
      if (maxCounter < goalCounter[i])
        maxCounter = goalCounter[i];
    }

    System.out.println("All goals: " + sum);
    double average = (double) sum / goals.length;
    System.out.println("Average: " + average);
    System.out.println("Max goals: " + max);
    System.out.println("Min goals: " + min);
    System.out.println("Mode: " + maxCounter);

    Player[] players = { new Player("Alex", 12), new Player("Aiden", 13),
        new Player("Bobbie", 18), new Player("Blaine", 20),
        new Player("Chris", 15), new Player("Charlie", 15) };

    boolean hasValue = false;
    int index = 0;
    while (!hasValue && index < players.length) {
      if (players[index].getAge() >= 18)
        hasValue = true;
      index++;
    }
    if (hasValue)
      System.out.println("The array has at least one instance of the property.");
    else
      System.out.println("The array has no instance of the property.");

    boolean allHaveValue = true;
    for (int i = 0; i < players.length; i++) {
      if (players[i].getAge() > 21)
        allHaveValue = false;
    }

    if (allHaveValue)
      System.out.println("All values of the array have the property.");
    else
      System.out.println("Not all values of the array have the property.");

    /* Use an enhanced for loop to count the number of players that are 15 years old and report the number. 
    * Change the values of the players array to test that your algorithm works properly (when no players are 15).
    */
    int count = 0;
    for (Player p : players) {
      if (p.getAge() == 15) count++;
    }

    System.out.println("Number of players that are 15 years old: " + count);

  }
  

}