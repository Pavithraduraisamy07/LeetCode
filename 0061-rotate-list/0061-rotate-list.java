/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        int listsize=0;
        ListNode thead=head,lastnode=null;;
        while(thead!=null){
            lastnode=thead;
            thead=thead.next;
            listsize++;
        }
        int moves=k%listsize;
        if(moves==0)return head;
        ListNode ntail=head;
        for(int i=1;i<listsize-moves;i++){
            ntail=ntail.next;
        }
        ListNode anshead=ntail.next;
        ntail.next=null;;
        lastnode.next=head;
        return anshead;
    }
}