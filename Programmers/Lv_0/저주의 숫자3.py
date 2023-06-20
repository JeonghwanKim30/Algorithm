def solution(n):
    count = 1
    arr= []
    for i in range(1,101):
        while(count % 3 == 0 or '3' in str(count)):
            count += 1
        arr.append(count)
        count +=1
    return arr[n-1]