
	 Difference(int[] elements){
        this.elements = elements; 
    }
    public void computeDifference(){
        int m = 0;
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                m =Math.max(Math.abs(elements[i]-elements[j]),m);
            }
        }
        maximumDifference = m;
    }

    // Add your code here
