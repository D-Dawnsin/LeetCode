class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode currl1 = l1;
        ListNode currl2 = l2;
        
        //create a dummy node to be placeholder
        ListNode dummy = new ListNode();
        //points the final list to a dummy
        ListNode finalList = dummy; 
        
        //This int is for the number that needs to be carried over anytime sum > 10
        int carry = 0; 
        
        while(currl1 != null || currl2 != null)
        {
            int sum = carry; //set sum to carry in case there is a carry from the last process
            
            if(currl1 != null){
                //Grabs the value of the listnode
                sum += currl1.val; 
                //sets the current listnode to the next node in the list
                currl1 = currl1.next;  
            }
            
             if(currl2 != null){
                //Grabs the value of the listnode
                sum += currl2.val;
                //sets the current listnode to the next node in the list
                currl2 = currl2.next;  
            }
            
            //Takes the remainder of the division of the first number by the second number
            //if first number is not divisible by the second number, then the answer will just be the first number
            int currentDigit = sum % 10;  
            carry = sum / 10;
            
            //assigns the 
            finalList.next = new ListNode(currentDigit);
            
            finalList = finalList.next;
        }  
        
        //If there is a number left to carry over than add it to the list
        if(carry == 1)
        {
            finalList.next = new ListNode(1);
        }
        
        return dummy.next;
    }
}
