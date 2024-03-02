//380 leetcode
import java.util.*;
class RandomizedSet {
    //declaration of ds to use
    private Map<Integer, Integer> map;
    private List<Integer> l;
    private Random r;

    public RandomizedSet() {
        //constructor
        this.map=new HashMap<Integer,Integer>();
        this.l= new ArrayList<Integer>();
        this.r = new Random();
    }
    
    public boolean insert(int val) {
        //if number already exists in our ds the operation is fail hence false 
        if(map.containsKey(val)) return false;
        l.add(val);
        map.put(val,l.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        //if number does not exists in our ds the operation is fail hence false 
        if(!map.containsKey(val)) return false;
        int id=map.remove(val);
        int lv=l.remove(l.size()-1);
        if(lv!=val){
            l.set(id, lv);
            map.put(lv,id);
        }
        return true; 
    }
    
    public int getRandom() {
        int ran= r.nextInt(l.size());
        return l.get(ran);
    }
}
