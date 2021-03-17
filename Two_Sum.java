public class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {

        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); //A HashMap is a collection of <key, value> 
        
        for(int i = 0; i < numbers.length; i++)
        {
            int diff = (int)(target - numbers[i]);
            
            if(hash.containsKey(diff)) //this allows user to see if the hashmap contains a particular value
            {
                int toReturn[] = {hash.get(diff), i}; //stores the two numbers that add up to the target in an array that is returned
                return toReturn;
            }

            hash.put(numbers[i], i); //putting the index number as the value because that is what we want to return. and putting the value in the array as the key for the index
            //To access a value from a HashMap, you use ".get()" and refer to its key
            
            //reason why we have the ".put()" method here is to make sure we can refer back to the hashmap in case there is a value that fits "diff" with the current value from the array
        }
    
        return null; //If there are no elements in the array that add up to the traget then return null
    }
}
