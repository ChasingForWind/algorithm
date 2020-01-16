public class 面试题35 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public class Solution {
        public RandomListNode Clone(RandomListNode pHead) {
            //鲁棒性
            if (pHead == null) return null;
            RandomListNode currentNode = pHead;
            //第一阶段，链表内复制
            while (currentNode != null) {
                RandomListNode temp = new RandomListNode(currentNode.label);
                RandomListNode nextNode = currentNode.next;
                temp.next = nextNode;
                currentNode.next = temp;
                //temp.random = pHead.random.next;
                currentNode = nextNode;
            }
            //第二阶段随机指针的复制
            currentNode = pHead;
            while (currentNode != null) {
                currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
                currentNode = currentNode.next.next;
            }
            //第三阶段,分解
            RandomListNode cloneHead = pHead.next;
            currentNode = pHead;
            while (currentNode != null) {
                RandomListNode clone = currentNode.next;
                currentNode.next = clone.next;
                clone.next = clone.next == null ? null : clone.next.next;
                currentNode = currentNode.next;
            }
            return cloneHead;
        }
    }
}
