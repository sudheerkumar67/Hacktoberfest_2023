class Node:
    def __init__(self, num: int):
        self.num = num
        self.next = None




# function to insert node at the end of the list
def insertNode(head: Node, val: int) -> Node:
    newNode = Node(val)
    if head == None:
        head = newNode
        return head
    temp = head
    while temp.next != None:
        temp = temp.next
    temp.next = newNode
    return head


# function to get reference of the node to delete




def getNode(head: Node, val: int) -> Node:
    while head.num != val:
        head = head.next
    return head




# delete function as per the question
def deleteNode(t: Node) -> None:
    t.num = t.next.num
    t.next = t.next.next
    return


# printing the list function




def printList(head: Node) -> None:
    while head.next != None:
        print(head.num, end="->")
        head = head.next
    print(head.num)




if __name__ == "__main__":
    head = None
    # inserting node
    head = insertNode(head, 1)
    head = insertNode(head, 4)
    head = insertNode(head, 2)
    head = insertNode(head, 3)
    # printing given list
    print("Given Linked List:")
    printList(head)
    t = getNode(head, 2)
    # delete node
    deleteNode(t)
    # list after deletion operation
    print("Linked List after deletion:")
    printList(head)