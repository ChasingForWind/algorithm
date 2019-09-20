import org.junit.Test;

import java.util.ArrayList;

public class Demo6 {

    /*ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }*/
    ArrayList<Integer> arr = new ArrayList<Integer>();
    @Test
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }

}
