def manacher_algorithm(s):
    
    processed_str = '#'.join('^{}$'.format(s))

    n = len(processed_str)
    p = [0] * n 

    center, right = 0, 0
    max_length, max_center = 0, 0

    for i in range(1, n - 1):
        if i < right:
            mirror = 2 * center - i
            p[i] = min(right - i, p[mirror])

        while processed_str[i + p[i] + 1] == processed_str[i - p[i] - 1]:
            p[i] += 1

        if i + p[i] > right:
            center, right = i, i + p[i]

        if p[i] > max_length:
            max_length, max_center = p[i], i

    start = (max_center - max_length) // 2
    end = start + max_length
    return s[start:end]

input_str = "babad"
result = manacher_algorithm(input_str)
print("Longest palindromic substring:", result)