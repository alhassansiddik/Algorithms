# Returns a string representation of value(s) if value is found.
# Else it returns a blank string if nothing is found
class BinarySearch:
    def search(array, searchValue):
        minIndex = 0
        maxIndex = len(array) - 1
        values = ""

        while minIndex <= maxIndex:
            midIndex = int ((maxIndex + minIndex) / 2)
            if array[midIndex] < searchValue:
                minIndex = midIndex + 1
            elif array[midIndex] > searchValue:
                maxIndex = midIndex - 1
            else:
                values += str(searchValue)
                break
        return values

    testArray = [0, 2, 4, 6, 8]
    result = search(testArray, 4)
    print(result)