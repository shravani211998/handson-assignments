class AssignOne{

		public static void main(String[] args){
			int i=0, sum=0, count=0, max, min, n;
			
					
			i = args.length;
			max = Integer.parseInt(args[0]);
			min = Integer.parseInt(args[0]);
			
			while(count<i){
				n = Integer.parseInt(args[count]);
				sum = sum + n;
				if(min>n)
				min = n;
				if(max<n)
				max = n;
				count = count + 1;
			
			}
			
		
		System.out.println("Sum = " + sum);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}



}