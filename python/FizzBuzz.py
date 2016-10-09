def fizzbuzz(end):
    [print("{}{}".format((i%3==0)*"Fizz", (i%5==0)*"Buzz") or i) for i in range(1, end + 1)]
    
fizzbuzz(100)