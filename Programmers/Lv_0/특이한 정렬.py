def solution(numlist, n):
    answer = []
    numlist.sort(reverse = True)
    middle = 0
    smallest = 10000
    for i in range(len(numlist)):
        if(abs(n-numlist[i])<smallest):
            middle = i
            smallest = abs(n - numlist[middle])
        else:
            break
    start = middle
    last = middle+1
    while(start >= 0 or last != len(numlist)):
        if(start == -1 ):
            answer.append(numlist[last])
            last +=1
            continue
        if(last == len(numlist)):
            answer.append(numlist[start])
            start -=1
            continue
        if(abs(n-numlist[start]) <= abs(n-numlist[last])):
            answer.append(numlist[start])
            start-=1
        else:
            answer.append(numlist[last])
            last += 1
            
    
    return answer