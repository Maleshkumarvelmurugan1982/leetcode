class Solution:
    def tribonacci(self, n: int) -> int:
        return (f:=cache(lambda n:n>2 and f(n-3)+f(n-2)+f(n-1) or (0,1,1)[n]))(n)
        