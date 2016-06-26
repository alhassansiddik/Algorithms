# Implementation of queue using array
class Queue:
    def __init__(self, size):
        self.size = size
        self.first = 0
        self.last = 0
        self.numItems = 0
        self.queueArray = [None] * size

    def insert(self, input):
        if self.numItems + 1 <= self.size:
            self.queueArray[self.last] = input
            self.last += 1
            self.numItems += 1
        else:
            print("Queue is full")

    # sorts queue from highest to lowest when being inserted
    def priorityInsert(self, input):
        if self.numItems is 0:
            self.insert(input)
        else:
            i = self.numItems - 1
            while i >= 0:
                if int(input) > int(self.queueArray[i]):
                    self.queueArray[i + 1] = self.queueArray[i]
                    i -= 1
                else:
                    break
            self.queueArray[i + 1] = input
            self.last += 1
            self.numItems += 1

    def remove(self):
        if self.numItems > 0:
            self.queueArray[self.first] = None
            self.first += 1
            self.numItems -= 1
        else:
            print("Queue is empty")

    def peek(self):
        return self.queueArray[self.first]

queue = Queue(2)
queue.insert("2")
queue.insert("5")
print(queue.peek())
queue.remove()
print(queue.peek())

queue2 = Queue(4)
queue2.priorityInsert("3");
queue2.priorityInsert("6");
queue2.priorityInsert("2");
queue2.priorityInsert("5");
print(queue2.peek())
queue2.remove()
print(queue2.peek())