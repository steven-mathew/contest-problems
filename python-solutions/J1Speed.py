speed_limit = int(input())
speed = int(input())

delta = speed - speed_limit

if delta < 1:
    print("Congratulations, you are within the speed limit!")
elif 1 < delta < 20:
    print("You are speeding and your fine is $100.")
elif 21 < delta < 31:
    print("You are speeding and your fine is $270.")
else:
    print("You are speeding and your fine is     $500.")