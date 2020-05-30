class Solution {
    static int[] num_to_bits = new int[] { 0, 1, 1, 2, 1, 2, 2, 
                                           3, 1, 2, 2, 3, 2, 3, 3, 4 };
    static int countSetBitsRec(int num) 
    { 
        int nibble = 0; 
        if (0 == num) 
            return num_to_bits[0];
        nibble = num & 0xf;
        return num_to_bits[nibble] + countSetBitsRec(num >> 4); 
    } 
    public int[] countBits(int num) {
        int[] result=new int[num+1];
        for(int i=0;i<=num;i++){
            result[i]=Integer.bitCount(i);
        }
        return result;
    }
}