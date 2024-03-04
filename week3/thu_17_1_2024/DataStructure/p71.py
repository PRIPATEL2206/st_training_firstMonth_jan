def transpose(n, m, A):
	BLOCK_SIZE = 64

	for i in range(0, n, BLOCK_SIZE):
		for j in range(0, m, BLOCK_SIZE):
			for k in range(i, min(i + BLOCK_SIZE, n)):
				for l in range(j, min(j + BLOCK_SIZE, m)):
					
					temp = A[k][l]
					A[k][l] = A[l][k]
					A[l][k] = temp


def main():
	n, m = 1024, 1024
	A = [[0] * m for _ in range(n)]

	
	for i in range(n):
		for j in range(m):
			A[i][j] = i * n + j

	
	transpose(n, m, A)

	return 0


if __name__ == "__main__":
	main()
