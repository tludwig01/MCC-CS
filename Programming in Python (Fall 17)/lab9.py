# key and value
#
# the key
#
# the string 'start' is the key and the integer 1472 is the value
#
# stores the key-value pair 'id' : 54321 in the employee dictionary
#
# ccc
#
# use the in operator to test for a specific key
#
# deletes the element at key 654
#
# 3
#
# 1
# 2
# 3
#
# pop accepts a key as an argument and returns the value associated with that key  and removes that key-value pair from the dictionary. The popitem method returns a randomly selected key-value pair as a tuple and removes that key-value pair form the dictionary
#
# returns all a dictionary's keys and their associated values as a sequence of tuples
#
# returns all the keys in a disctionary as a sequence of tuples
#
# unordered
#
# no
#
# set function
#
# 'j','u','p','i','t','e','r'
#
# 25
#
# 'w',' ','x','y','z'
#
# 1,2,3,4
#
# 'www','xxx','yyy','zzz'
#
# pass argument into the len function
#
# 10,9,8,1,2,3
#
# 10,9,8,'a','b','c'
#
# if the specified element to delete in not in the set, the remove mehtod raises a KeyError exception but the discard method does not
#
# in operator
#
# {10, 20, 30, 100, 200, 300}
#
# {3,4}
#
# {1,2}
#
# {5,6}
#
# {'a', 'd'}
#
# set2 is a subset of set1 and set1 is a superset of set2

def main():
    dictionary = {}
    with open("capitals.txt") as infile:
        for line in infile:
            (key, value) = line.split('\n')
            dictionary[key] = value
    print(dictionary)
main()
