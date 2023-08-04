package src.leetcode;

public class ListNode {
    int val;          // The integer value stored in the node.
    ListNode next;    // Reference to the next node in the linked list.

    // Constructors
    ListNode() {}                     // Default constructor (creates a node with default values).
    ListNode(int val) { this.val = val; }                           // Constructor with value only.
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }   // Constructor with value and next node reference.
}