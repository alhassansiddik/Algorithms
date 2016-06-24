# takes an array as input and returns a sorted array using selection sort algorithm
class SelectionSort:
    def sort(array):
        for i in range(0,len(array)):
            min = i
            for j in range(i,len(array)):
                if array[min] > array[j]:
                    min = j
            temp = array[i]
            array[i] = array[min]
            array[min] = temp

    testArray = [3, 7, 5, 9, 2]
    sortedArray = sort(testArray)
    for i in testArray:
        print(i)