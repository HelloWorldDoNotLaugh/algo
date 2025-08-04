package com.wy.algo.leetcode.strc.link;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wy
 * @since 2025/8/4 12:17
 */
@Getter
@Setter
public class ListNode {
    protected int val;
    protected ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static ListNode of(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
}
