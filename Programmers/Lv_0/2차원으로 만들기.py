def solution(num_list, n):
    answer = []
    array = []
    i = 0
    count = 0
    while(i<len(num_list)):
        array.append(num_list[i])
        count +=1
        if((count)%n==0):
            count = 0
            answer.append(array)
            array = []
        i+=1
    return answer