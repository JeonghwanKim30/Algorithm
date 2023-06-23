def solution(price):
    answer = 0
    if (price >= 600000):
        answer = price*(0.8)
    elif(price <100000):
        answer = price
    else:
        answer = price*(1-(1/20)*(2**((price-100000)//200000)))
    return int(answer)