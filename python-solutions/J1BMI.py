w = float(input())
h = float(input())

bmi = w/(h*h)

if bmi < 18.5:
    print("Underweight")
elif 18.5 < bmi < 25:
    print("Normal weight")
else:
    print("Overweight")
