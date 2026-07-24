class TimeMap {
    class Pair
    {
        int  timeStamp;
        String val;
        
    Pair(int timeStamp,String val)
    {
        this.timeStamp = timeStamp;
        this.val = val;  
    }
    }

    HashMap<String,ArrayList<Pair>> map;
    
    public TimeMap() {
     map = new HashMap<>();  
    }
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>()); 
        map.get(key).add(new Pair(timestamp,value));  
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }

        List<Pair>list = map.get(key);

        int i=0;
        int j= list.size()-1;

        String ans = "";
        while(i<=j)
        {
            int  mid = (i+j)/2;
            if(list.get(mid).timeStamp ==timestamp)
            {
                return list.get(mid).val;
            }
            else if(list.get(mid).timeStamp < timestamp)
            {
                ans = list.get(mid).val;
                i=mid+1;
            }
            else
            {
                j= mid-1;
            }
        }
        return ans;
    }
}
