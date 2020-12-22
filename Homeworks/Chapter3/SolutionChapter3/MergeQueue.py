SIZE = 100
class Queue:
    def __init__(self, max_size):
        self.max_size = max_size
        self.size = 0
        self.array = [None] * max_size
        self.rear = 0
        self.front = 0

    def enqueue(self, object):
        if self.size == self.max_size - 1:
            return 'The queue is full'
        self.rear = (self.front + self.size) % self.max_size
        self.array[self.rear] = object
        self.size += 1

    def dequeue(self):
        if self.isEmpty():
            return 'The queue is empty'
        object = self.array[self.front]
        self.array[self.front] = None
        self.front = ( self.front + 1) % self.max_size
        self.size -= 1
        return object

    def print_queue(self):
        while self.size > 0:
            print(self.dequeue(), end = ' ')

    def first(self):
        if self.isEmpty():
            return 'The queue is empty'
        return self.array[self.front]

    def get_size(self):
        return self.size

    def isEmpty(self):
        return self.size == 0

def merge(q1, q2):
    result = Queue(2*SIZE)
    i = j = 0
    q1_size = q1.get_size()
    q2_size = q2.get_size()
    while i < q1_size and j < q2_size:
        if q1.first() > q2.first():
            result.enqueue( q1.dequeue() )
            i += 1
        else:
            result.enqueue( q2.dequeue() )
            j += 1

    while i < q1_size:
        result.enqueue( q1.dequeue() )
        i += 1
    while j < q2_size:
        result.enqueue( q2.dequeue() )
        j += 1
    return result




q1 = Queue(SIZE)
q2 = Queue(SIZE)
q3 = Queue(SIZE)
number = int( input() )
array = input().split()
for obj in array:
    q1.enqueue(int(obj))

number = int( input() )
array = input().split()
for obj in array:
    q2.enqueue(int(obj))

number = int( input() )
array = input().split()
for obj in array:
    q3.enqueue(int(obj))

result = merge(q1, q2)
result = merge(result, q3)
result.print_queue()
