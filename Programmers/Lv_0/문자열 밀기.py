def solution(A, B):
    answer = -1
    new = ''
    if(A==B) : return 0
    for i in range(1,len(A)):
        new = A[-i:] + A[0:len(A)-i]
        if(new == B):
            answer =i
            break
            
    return answer