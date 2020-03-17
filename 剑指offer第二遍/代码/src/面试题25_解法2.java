import classes.ListNode;

public class 面试题25_解法2 {
    public class Solution {
        public ListNode Merge(ListNode list1,ListNode list2) {
            //递归终止条件
            if (list1==null) return list2;
            if (list2==null) return list1;
            //建立临时节点
            ListNode temp = null;
            //分情况递归
            if (list1.val>list2.val){
                temp = list2;
                temp.next = Merge(list1,list2.next);
            }
            else{
                temp = list1;
                temp.next = Merge(list2,list1.next);
            }
            return temp;
        }
    }
}
