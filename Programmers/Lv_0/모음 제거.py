def solution(my_string):
    del_string = ['a','e','i','o','u']
    for i in del_string:
        my_string = my_string.replace(i,'')
    return my_string