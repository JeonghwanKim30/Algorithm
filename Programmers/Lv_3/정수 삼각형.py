def solution(triangle):
    answer = 0
    arr = []

    for i in range(1,len(triangle)):
        for j in range(len(triangle[i])):
            before = i-1
            if(j == 0):
                triangle[i][j] += triangle[before][j]
            elif(j == len(triangle[i])-1 ):
                triangle[i][-1] += triangle[before][-1]
            else:
                triangle[i][j] += max(triangle[before][j-1],triangle[before][j])
        
    answer = max(triangle[len(triangle)-1])
    return answer