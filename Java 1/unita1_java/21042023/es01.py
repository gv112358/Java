import random
somma=0
media=0
numeri=[]*10000000
for i in range(10000000-1):
    numeri.append(random.randint(0, 1000))
    somma += numeri[i]

media=somma/10000000

print(f"La media è {media}")