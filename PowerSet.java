
class PowerSet {
    
    static void printPowerSet(char[] set,int set_size){    
      int pow_set_size = (int)Math.pow(2,set_size);
      int counter, j;
      int temp=0;
      for(counter = 0; counter < pow_set_size; counter++)
      {
        for(j = 0; j < set_size; j++)
         {
            temp=counter & (1<<j);
            if(temp>0)
              System.out.print(set[j]+" ");
         }
         System.out.println("");
      }
    }

	public static void main (String[] args) {
	    char[] set = {'a','b','c'};
        printPowerSet(set, 3);
	}
}