<div dir="rtl">

# سوال 4 - Wicked or Tame؟

+ محدودیت زمان: ۱ ثانیه
+ محدودیت حافظه: ۲۵۶ مگابایت

----------

## wicked or tame? the problem is...

به دنباله ای از اعداد طبیعی به طول n که تفاضل تمامی جفت عددهای متوالی آن شامل تمام اعداد 1 تا n-1 باشد دنباله‌ی  خوش رفتار (tame) می‌گویند. برای مثال دنباله‌ی زیر یک دنباله خوش رفتار است.

1 4 2 3
این دنباله به این خاطر خوش رفتار است که تفاضل میان اعداد آن برابر 3، 2و 1 است. 

دقت داشته باشید که دنباله تفاضل اعداد لزوما نباید مرتب شده باشد و فقط کافی است که همه ی جمله های دنباله موجود باشد.

# ماتریس خوش رفتار:
ماتریس خوش رفتار ، ماتریسی است که دنباله اعداد هر سطر یا ستون آن خوش رفتار باشند.
برای مثال ماتریس زیر یک ماتریس خوش رفتار است.


<div dir="ltr">

```  
     3 1 2
     6 4 3
M =  4 2 1
     5 3 4
```

</div>

دلیل خوش رفتاری ماتریس فوق به این صورت است که دنباله های (2,1,3)(3,4,6)(1,2,4)(4,3,5) که سطر های آن هستند هر کدام خوش رفتار بوده، و دنباله های (2,3,1,4)(1,4,2,3)(3,6,4,5) که ستون های ماتریس فوق هستند نیز هر کدام به تنهایی خوش رفتار هستند.



# ورودی
در سطر اول عدد n که تعداد ماتریس های ورودی به شما داده میشود.


   n < 30

در سطر های بعدی ابتدا دو عدد i,j که تعداد سطر و ستون هر ماتریس است داده شده 
و سپس خود ماتریس داده میشود.

   i,j <= 10

# خروجی

برای هر ماتریس در صورتی که خوش رفتار بود عبارت "Tame"  و در صورتی که نبود عبارت "Wicked" را چاپ کنید.

# مثال

\*در اینجا چند نمونه برای فهم بهتر صورت سوال و قالب ورودی و خروجی تست‌ها داده می‌شود.*

## ورودی نمونه ۱

<div dir="ltr">

```
2
4 3
3 1 2
6 4 3
4 2 1
5 3 4
3 3
1 2 3
2 2 2
6 7 0
```
</div>

## خروجی نمونه ۱

<div dir="ltr">

```
Tame
Wicked
```
</div>

</div>
