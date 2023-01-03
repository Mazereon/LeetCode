/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.


Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17

*/

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) 
    {
        int maxWealth = 0;
        for (int x=0; x<accounts.length; x++ )
        {
            int temp = 0;
            for (int y=0; y<accounts[x].length; y++)
            { 
                temp += accounts[x][y];
                if (temp > maxWealth)
                    maxWealth = temp;
            }
        }
        return maxWealth;
    }
}
