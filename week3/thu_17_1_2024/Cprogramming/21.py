def suffixArray(s):

    satups = sorted([(s[i:], i) for i in range(0, len(s)+1)])

    return map(lambda x: x[1], satups)
def bwt(t):
    bw = []
    for si in suffixArray(t):
       if si == 0:
           bw.append('$')
       else:
           bw.append(t[si-1])
    return ''.join(bw)


t=bwt("tomorrow and tomorrow and tomorrow")
print(t)