def solution(chicken):
    coupon = chicken
    answer = 0
    while(coupon >= 10):
        newcoupon = coupon//10
        answer += newcoupon
        coupon %= 10
        coupon += newcoupon
    return answer