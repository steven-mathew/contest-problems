cal = 0

choice = int(input())
if choice == 1:
    cal += 461
elif choice == 2:
    cal += 431
elif choice == 3:
    cal += 420

choice = int(input())
if choice == 1:
    cal += 100
elif choice == 2:
    cal += 57
elif choice == 3:
    cal += 70

choice = int(input())
if choice == 1:
    cal += 130
elif choice == 2:
    cal += 160
elif choice == 3:
    cal += 118

choice = int(input())
if choice == 1:
    cal += 167
elif choice == 2:
    cal += 266
elif choice == 3:
    cal += 75

print("Your total Calorie count is %s." % cal)