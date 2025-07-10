package Arrays;


class arryc{
    public static void main(String[] args) {
        int arry[] = {1,2,3,4,2,12,15,16,18,21,30,156,78,40,150,50,48,45};
        
        int count=0;
        
        for(int i=0; i<arry.length;i++){
            if(arry[i]%3 == 0 && arry[i]%5==0){
                count=count+1;
                System.out.println(arry[i]);
            }
           
        }
        System.out.println("count: "+count);
    }
}
