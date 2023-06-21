import math

def solution(box, n):
    return math.prod(box[i]//n for i in range(len(box)))