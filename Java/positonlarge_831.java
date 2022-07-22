class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        int i=0;
        int count=1;
        while(i<ch.length-1){
            if(ch[i]==ch[i+1]){
                count+=1;
            }else{
                if(count>2){
                    List<Integer> l = new ArrayList<>();
                    l.add(i-count+1);
                    l.add(i);
                    list.add(l);
                    count=1;
                }else{
                    count=1;
                }
            }
            i++;
        }
        if(count>2){
            List<Integer> l = new ArrayList<>();
            l.add(i-count+1);
            l.add(i);
            list.add(l);
        }
        return list;
    }
}