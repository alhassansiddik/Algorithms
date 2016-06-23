# returns string representation of value(s) if value is found
# else returns a blank string if nothing is found
class LinearSearch:
    def search(array, searchvalue):
        values = ""
        for j in array:
            if j is searchvalue:
                values += str(searchvalue)
        return values

    testArray = [0, 2, 4, 6, 8]
    result = search(testArray, 4)
    print(result)