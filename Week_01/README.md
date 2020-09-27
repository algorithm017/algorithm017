## ArrayList, Linked List, skip list

Array: 
continued memory usage managed by memory controller.
Lookup: O(1)
Insert and delete: O(n): average: n/2

Linked list: Single linked list, Doubly linked list, Circular linked list
Lookup: O(n)
Insert and delete: o(1) (2 times, point the pointer to the new next node)

Skipped list:
Lookup, inset, delete: O(logn)
Use case: redis, LevelDB, lru cache (leetcode 146)


## Stack, Queue, Deque(double-ended queue), priority queue (heapq in python)

Priority queue: use heap, Bst.
