<div dir="rtl">

# سوال 1 - الگوریتم پیچیده

پیچیدگی زمانی الگوریتم زیر را تحلیل کنید.


<div dir="ltr">
    
```
function f(n):
    int sum = 0
    for(int i=1; i<n; i*=2)
        for(int j=n; j>0; j/=2)
            for(int k=j; k<n; k+=2)
                sum += i*j*k
    return sum
```
</div>

</div>
