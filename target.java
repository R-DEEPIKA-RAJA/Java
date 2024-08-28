class target
{
    public static void main (String[] args) {
     int[] ans = new int[2];
     int[] num = {1,2,3,6,7};
     int target=13;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[j] == target- num[i]) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
            System.out.println(ans[0]);
                    System.out.println(ans[1]);        
        }
        
    }
}
        