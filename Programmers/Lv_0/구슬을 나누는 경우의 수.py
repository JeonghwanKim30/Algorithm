import math

def solution(balls, share):
    answer = 1
    for i in range(share):
        answer *= balls
        balls -= 1
    return answer/math.factorial(share)