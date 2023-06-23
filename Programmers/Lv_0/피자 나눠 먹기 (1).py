def solution(n):
    answer = n/7
    if (n/7 != int(n/7)):
        answer = int(n/7)+1
    return answer