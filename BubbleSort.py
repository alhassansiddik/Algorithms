# takes an array as input and returns a sorted array using bubble sort algorithm
class BubbleSort:
    def sort(array):
        for i in range(len(array) - 1, 0, -1):
            for j in range(i):
                if array[j] > array[j + 1]:
                    temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
        return array

    testArray = [3, 7, 5, 9, 2]
    sortedArray = sort(testArray)
    for i in testArray:
        print(i)