class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> curr = new ArrayList<>();
        ArrayList<String> temp = arrange(words);
        int i=0;
        while ( i < words.length ) {
            int j =i;
            while (j < words.length && temp.get(i).equals(temp.get(j))){
                j++;
            }
            curr.add(words[i]);
            i = i!=j?j:i+1;
        }
        return curr;
    }
    
    public ArrayList<String> arrange(String[] arr){
        ArrayList<String> ss = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            ss.add(String.valueOf(ch));
        }
        return ss;
    }
}