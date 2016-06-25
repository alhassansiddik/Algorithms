# Implementation of stack using array
class Stack:
    def __init__(self, size):
        self.size = size
        self.first = -1
        self.stackArray = [None] * size

    def push(self, input):
        if self.first + 1 < self.size:
            self.first += 1
            self.stackArray[self.first] = input
        else:
            print("Stack is full")

    def pop(self):
        if self.first >= 0:
            temp = self.stackArray[self.first]
            self.stackArray[self.first] = None
            self.first -= 1
            return temp
        else:
			print("Stack is empty")
            return None

    def peek(self):
        return self.stackArray[self.first]

stack = Stack(2)
stack.push("5")
stack.push("2")
print(stack.peek())
stack.pop()
print(stack.peek())