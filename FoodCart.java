public class FoodCart
{
    int parcelCost = 350;
    int parcelPrice = 600;
    int chickenCost = 150;
    int chickenPrice = 250;
    int fishCost = 100;
    int fishPrice = 175;
    public static void main(String args[])
    {
        FoodCart help = new FoodCart();
        help.solution();
    }

    public int calculateProfit(int chicken, int fish, int parcel)
    {
        int chickenProfit = chicken * (chickenPrice - chickenCost);
        int fishProfit = fish * (fishPrice - fishCost);
        int parcelProfit = parcel * (parcelPrice - parcelCost);
        int profit = chickenProfit + fishProfit + parcelProfit - 1500;

        return profit;
    }

    public boolean passConstraints(int chicken, int fish, int parcel)
    {
        if (chicken + fish + parcel!= 50)
            return false;
        else if (fish % 2 != 0)
            return false;
        else if (chicken % 3 != 0)
            return false;
        else if (parcel > 25)
            return false;
        else if (chicken < 5 || fish < 5 || parcel < 5)
            return false;
        else if ((chicken * chickenCost) + (fish * fishCost) + (parcel * parcelCost) > 15000)
            return false;
        else
            return true;
    }

    public void solution()
    {
        int maxProfit = 0;
        int opt_chicken = 0;
        int opt_fish = 0;
        int opt_parcel = 0;

        for (int chicken = 0; chicken < 50; chicken++)
        {
            for (int fish = 0; fish < 50; fish++)
            {
                for (int parcel = 0; parcel < 50; parcel++)
                {
                    if (passConstraints(chicken, fish, parcel))
                    {
                        int profit = calculateProfit(chicken, fish, parcel);
                        if (profit > maxProfit)
                        {
                            maxProfit = profit;
                            opt_fish = fish;
                            opt_chicken = chicken;
                            opt_parcel = parcel;
                        }
                        System.out.println("Fish: " + fish + " Chicken: " + chicken + " Parcel: " + parcel + " Profit:" + profit);
                    }
                }
            }
        }
        System.out.println("Optimal solution is....Fish: " + opt_fish + " Chicken: " + opt_chicken + " Parcel: " + opt_parcel + " Profit:" + maxProfit);
    }


}

