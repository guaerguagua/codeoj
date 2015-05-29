import java.util.*;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode p = result;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				p.val += l1.val + l2.val;
				if (p.val >= 10) {
					p.val -= 10;
					p.next = new ListNode(1);
					p = p.next;

				} else {
					if (!(l1.next == null && l2.next == null)) {
						p.next = new ListNode(0);
						p = p.next;
					}
				}
				l1 = l1.next;
				l2 = l2.next;
			}
			if (l1 != null && l2 == null) {
				p.val += l1.val;
				if (p.val >= 10) {
					p.val -= 10;
					p.next = new ListNode(1);
					p = p.next;

				} else {
					if (!(l1.next == null)) {
						p.next = new ListNode(0);
						p = p.next;
					}
				}
				l1 = l1.next;
			}
			if (l1 == null && l2 != null) {
				p.val += l2.val;
				if (p.val >= 10) {
					p.val -= 10;
					p.next = new ListNode(1);
					p = p.next;

				} else {
					if (!(l2.next == null)) {
						p.next = new ListNode(0);
						p = p.next;
					}
				}
				l2 = l2.next;
			}

		}

		return result;
	}

}