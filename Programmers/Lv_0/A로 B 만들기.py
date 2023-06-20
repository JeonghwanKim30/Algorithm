def solution(before, after):
    answer = 0
    bearr=[]
    afarr=[]
    for i in range(len(before)):
        bearr.append(before[i])
        afarr.append(after[i])
    bearr.sort()
    afarr.sort()
    
    before = "".join(bearr)
    after = "".join(afarr)
    if(bearr == afarr):
        answer = 1
    return answer