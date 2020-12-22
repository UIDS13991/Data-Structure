from sys import stdin
o_brc = '[{<(,'
c_brc = "]}>)'"
for a in stdin:
    a = a.replace('(*', ',')
    a = a.replace('*)', "'")
    if a[-1] == '\n':
        a = a[:-1]
    stc = list()
    for index, ch in enumerate(a):
        if ch in o_brc:
            stc.append(ch)
        elif ch in c_brc:
            if not len(stc) == 0 and stc[-1] in o_brc and o_brc.index(stc[-1]) == c_brc.index(ch):
                stc.pop()
            else:
                print(f'NO {index + 1}')
                break
    else:
        if len(stc) == 0:
            print('YES')
        else:
            print(f'NO {len(a) + 1}')
