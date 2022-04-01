//Input: tickets = [2,3,2], k = 2
//Output: 6
//Explanation: 
//- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
//- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
//The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
class TimeNeededtoBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        
        int target=tickets[k];
        for(int i=0;i<=k;i++)
            time+=Math.min(tickets[i],target);
        
        target--;
        for(int i=k+1;i<tickets.length;i++)
            time+=Math.min(tickets[i],target);
        
        
        return time;
    }
}