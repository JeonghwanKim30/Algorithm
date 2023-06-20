def solution(my_string):
    
    array = []
    for i in range(len(my_string)):
        if(my_string[i] not in array):
            array.append(my_string[i])
    answer = "".join(array)
    return answer