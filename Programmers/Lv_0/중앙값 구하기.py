def solution(array):
    temp = 0
    for i in range(len(array)-1):
        for j in range(0,len(array)-i-1):
            if(array[j] > array[j+1]):
                temp = array[j+1]
                array[j+1]=array[j]
                array[j] = temp
    answer = array[int(len(array)/2)]
    return answer