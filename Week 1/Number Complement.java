class Solution {
    public int findComplement(int num) {
        return onesComplement(num);
    }
    static int onesComplement(int n) 
	{ 
		int bits = 
			(int)(Math.floor(Math.log(n) / 
							Math.log(2))) + 1; 
		return ((1 << bits) - 1) ^ n; 
	} 
}