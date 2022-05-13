package PublicClass.DemoList;

import java.util.Stack;

public class reverseLinkList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        System.out.println("before:");
        listNode.print();
        System.out.println();
        System.out.println("after:");

        //头插法
//        ListNode reverseList = headReverseList(listNode);
//        listNode.print();
//        System.out.println();
//        reverseList.print();

        //出栈法
//        ListNode reverseList = stackReverseList(listNode);
//        reverseList.print();

        //三指针法
        ListNode reverseList = pointerReverseList(listNode);
        reverseList.print();

        //递归法
//        ListNode reverseList = recursionReverseList(listNode);
//        reverseList.print();
    }

    //头插法
    public static ListNode headReverseList(ListNode head) {
        //传入空链表处理
        if (head == null) {
            return null;
        }
        //表示当前结点，初始值为传入值head
        ListNode last = head;
        //
        ListNode cur = head.next;
        ListNode temp;
        while (cur != null) {
            temp = cur;
            cur = cur.next;
            temp.next = head;
            head = temp;
        }
        //将当前结点的后继置空
        last.next = null;
        return head;
    }

    //出栈法
    public static ListNode stackReverseList(ListNode head) {
        //新建栈堆
        Stack<ListNode> stc = new Stack<ListNode>();
        //表示当前结点，初始值为传入值head
        ListNode node = head;
        //传入空链表处理
        if (head == null) {
            return null;
        }
        //不为空链表时依次压栈
        while (node != null) {
            stc.push(node);
            node = node.next;
        }
        //
        ListNode newHead = new ListNode(stc.pop().val);
        ListNode tmp = newHead;
        while (stc.size() > 0) {
            node = stc.pop();
            ListNode newTmp = new ListNode(node.val);
            tmp.next = newTmp;
            tmp = newTmp;
        }
        //返回新链表的头结点
        return newHead;
    }

    //三指针法
    public static ListNode pointerReverseList(ListNode head) {
        //传入空链表处理
        if (head == null) {
            return null;
        }
        //表示当前节点的前一个节点，初始值为null
        ListNode prev = null;
        //表示当前节点，初始值为head
        ListNode cur = head;
        //表示当前节点的下一个节点
        ListNode next;
        while(cur != null){
            //先提前保存当前节点的下一个节点
            next = cur.next;
            //将当前节点的next指针指向当前节点的前一个节点
            cur.next = prev;
            //更新prev，即将temp赋值给prev
            prev = cur;
            //更新temp，即将next赋值给temp
            cur = next;
        }
        //退出循环时temp为null，那么temp的前一个节点prev即为新的头结点
        return prev;
    }

    //递归法
    public static ListNode recursionReverseList(ListNode head) {
        //传入空链表处理;或者处理到结尾，返回整个链表
        if (head == null || head.next == null) {
            return head;
        }
        //获取之后处理好的链表
        ListNode newhead = recursionReverseList(head.next);
        //处理好的链表的尾结点的next指向head
        head.next.next = head;
        //head也反转到null
        head.next = null;
        //返回新链表的头结点
        return newhead;
    }
}
