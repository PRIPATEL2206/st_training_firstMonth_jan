# file 44.py
import random

def is_prime_miller_rabin(n, k=5):
    if n <= 1:
        return False
    if n == 2 or n == 3:
        return True
    if n % 2 == 0:
        return False

    def check_composite(a, d, s, n):
        x = pow(a, d, n)
        if x == 1 or x == n - 1:
            return False
        for _ in range(s - 1):
            x = pow(x, 2, n)
            if x == n - 1:
                return False
        return True

    s, d = 0, n - 1
    while d % 2 == 0:
        s += 1
        d //= 2

    for _ in range(k):
        a = random.randint(2, n - 2)
        if check_composite(a, d, s, n):
            return False

    return True

# Example Usage:
num = 7919
result = is_prime_miller_rabin(num)
print(f"{num} is prime: {result}")
