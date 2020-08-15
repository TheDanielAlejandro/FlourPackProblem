public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {    // . Creating a method canPack, that returns a boolean value

        int totBigCount = bigCount * 5;                                        // . Multiplying the value bigCount by 5, every bag in the big count is 5Kg.
        int sumBags = totBigCount + smallCount;                                // . Summing all the bags available to check if the amount is enough for the goal.

        if ((sumBags > goal) && (goal > 0)) {                                  // . Check if the amount is enough and check that the goal is greater than 0

            while(goal>0) {                                                    // . Creating a while-loop that runs until goal turns 0, allowing to check if the amount of big count and small count are enough for the goal.

                if ((goal % 5) == 0 && bigCount > 0) {                         // . If-statement that check if the reminder of goal by 5 is 0 and that big count is higher than 0
                    goal = goal - 5;                                           // . if yes, decrease the goal value by 5 (equivalent of 1 bigCount).
                    bigCount--;                                                // . Decrease the bigCount by 1 (because it was deleted by the goal in the line before).

                } else if(smallCount >0){                                      // . The alternative happens only if the big count is equal to 0 (in input or after the cycles) and the goal is not reached yet.
                    goal--;                                                    // . Decrease the goal amount by one element in small count until goal turns to 0.
                    smallCount--;

                }else{                                                         // . Returns false in the case there are elements in bigCount and/or smallCount but, they don't fulfill the goal 100%.  (3 bigCount , 0 smallCount, 12 goal || 2 big count, 1 small count, goal 7)
                    return false;
                }

            }
            return true;                                                       // . If the loops end without returns false, that means that the values can fulfill the goal. So returns true,

        }else if(sumBags == goal) {                                            // . The if statement that check's  if the sum of all bags is equal to the goal so returns True.
            return true;

        }else{                                                                 // . The alternative is that there aren't enough bags to fulfill the goal parameter. So returns false.
            return false;
        }
    }


}

