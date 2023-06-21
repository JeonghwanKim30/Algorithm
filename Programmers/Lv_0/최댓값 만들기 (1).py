def solution(numbers):
    answer = 0
    temp = 0
    for i in range(len(numbers)-1):
        for j in range(0,len(numbers)-1-i):
            if (numbers[j] > numbers[j+1]):
                temp = numbers[j+1]
                numbers[j+1]=numbers[j]
                numbers[j]=temp
    
    answer = numbers[len(numbers)-1]*numbers[len(numbers)-2]
    return answer