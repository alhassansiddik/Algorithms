# takes an array as input and returns a sorted array using selection sort algorithm
class InsertionSort:
    def sort(array):
        for i in range(1, len(array)):
            j = i
            insert = array[i]
            while j > 0 and array[j - 1] > insert:
                array[j] = array[j - 1]
                j -= 1
            array[j] = insert
        return array

    testArray = [3, 7, 5, 9, 2]
    sortedArray = sort(testArray)
    for i in testArray:
        print(i)