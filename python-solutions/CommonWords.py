n = int(input())  # number of data sets
currmax = 0

for i in range(n):
    m, k = input().split()  # m is amount of words, k represents which degree of common word to find (1st, 2nd)
    m = int(m)
    k = int(k)
    words = []
    wordcount = []
    if len(wordcount) > 0:
        for j in range(m):
            word = input()
            if word in words:
                wordcount[words.index(word)] = int(wordcount[words.index(word)]) + 1
            else:
                words.append(word)
                wordcount.append(1)
        for j in range(k):
            for l in range(len(wordcount)):
                if wordcount[l] == currmax:
                    wordcount[l] = 0
            currmax = max(wordcount)

    num = str(k)
    if num[len(num) - 1] == '1' and num[len(num) - 2] != '1' or num == '1':
        print("1st most common word(s):")
    elif num[len(num) - 1] == '2' and num[len(num) - 2] != '1' or num == '2':
        print("2nd most common word(s):")
    elif num[len(num) - 1] == '3' and num[len(num) - 2] != '1' or num == '3':
        print("3rd most common word(s):")
    else:
        print(num + "th most common word(s):")

    if currmax > 0:
        for j in range(len(wordcount)):
            if wordcount[j] == currmax:
                print(words[j])
    print("")