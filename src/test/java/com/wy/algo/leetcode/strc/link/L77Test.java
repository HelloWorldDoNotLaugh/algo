package com.wy.algo.leetcode.strc.link;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author wy
 * @since 2025/8/4 12:22
 */
@Slf4j
class L77Test {


    @Test
    void sortList() {
        L77 l77 = new L77();
        ListNode head = ListNode.of(4, 2, 1, 3);
        ListNode sortedList = l77.sortList(head);

        // 打印排序后的链表
        while (sortedList != null) {
            log.info("{}", sortedList.val);
            sortedList = sortedList.next;
        }
    }
}