# file 93.py
import hashlib

class CarterWegmanHash:
    def __init__(self, prime, num_buckets):
        self.prime = prime
        self.num_buckets = num_buckets
        self.a = self.generate_random_coefficient()
        self.b = self.generate_random_coefficient()

    def generate_random_coefficient(self):
        # In a real-world scenario, you may want to use a more secure random number generator
        return hash(str(hashlib.sha256(str(hashlib.sha256(b"seed").digest()).encode()).digest()).encode())

    def hash(self, key):
        return ((self.a * hash(key) + self.b) % self.prime) % self.num_buckets

# Example usage:
prime = 97  # Choose a prime number
num_buckets = 10  # Number of buckets in the hash table

hash_function = CarterWegmanHash(prime, num_buckets)

# Hash some keys
keys = ["apple", "banana", "orange", "grape", "watermelon"]

for key in keys:
    bucket = hash_function.hash(key)
    print(f"Key: {key}, Hashed to Bucket: {bucket}")
