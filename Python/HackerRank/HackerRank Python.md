

# HackerRank Python



1. Lists

```python
if __name__ == '__main__':
    N = int(input())
    list=[]
    for i in range(N):
        A = input().split()
        if len(A) == 3:
            eval('list.' + A[0] + '(' + A[1] + ',' + A[2] + ')')
        elif len(A) == 2:
            eval("list." + A[0] + "(" + A[1] + ")")
        elif A[0] == "print":
            print(list)
        else:
            eval("list." + A[0] + "()")
```

