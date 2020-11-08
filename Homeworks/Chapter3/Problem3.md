<div dir="rtl">

# سوال 3 - پشتک

### برگرفته از تمرین ۲ بخش 10.1 کتاب CLRS

می‌خواهیم در آرایه‌ی A به طول n، دو پشته قرار دهیم به طوری که تنها با رسیدن جمع تعداد اعضای دو پشته به n، تابع isFull برای هر دو پشته true گردد. سه عمل زیر را طوری پیاده‌سازی کنید که هزینه‌ی انجام هر عمل، از O(1) باشد (تعداد عملیات انجام شده وابسته به n نباشد):

تابع push(x,S): افزودن مقدار x به پشته‌ی S
تابع pop(S): برداشتن عنصر بالای پشته‌ی S
تابع isFull(): برای بررسی پر شدن آرایه‌ی حاوی دو پشته
فرض کنید مقدار S، یکی از دو عدد ۱ یا ۲ را می‌پذیرد که بیانگر شماره‌ی پشته‌ی مورد نظر می‌باشد.

اختیاری: مسئله‌ی فوق را به حالت k پشته در یک آرایه تعمیم دهید.

### متن اصلی تمرین
<div dir="ltr">
Explain how to implement two stacks in one array A[1...n] in such a way that neither stack overflows unless the total number of elements in both stacks together is n. The PUSH and POP operations should run in O(1) time.

</div>
</div>
