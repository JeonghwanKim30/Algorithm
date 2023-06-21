def solution(numbers, k):
    i=1
    man = 1
    while(i<k):
        man +=2
        man %=len(numbers)
        i+=1
    return man