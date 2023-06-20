def solution(my_string):
    answer = ''
    array=[]
    my_string=my_string.lower()
    for i in range(len(my_string)):
        array.append(my_string[i])
    array.sort()
    answer =''.join(array)
    return answer