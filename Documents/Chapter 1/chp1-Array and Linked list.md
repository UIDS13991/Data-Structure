<div dir="rtl">

# بخش اول : لیست پیوندی و آرایه

نمونه سوالات زیر در کلاس حل تمرین روز سه‌شنبه ۲۲ مهر، بحث و حل خواهند شد. حتما تا قبل از کلاس بر روی راه حل آن‌ها فکر کنید.

همچنین لینک‌های زیر منابع خوبی برای تفهیم و تمرین بیشتر هستند:

[Linked Lists](https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html#:~:text=A%20linked%20list%20is%20a,the%20head%20of%20the%20list.)

[Linked Lists](https://www.geeksforgeeks.org/data-structures/linked-list/)

[Arrays](https://www.geeksforgeeks.org/array-data-structure/)

[Matrices](https://www.geeksforgeeks.org/matrix/)

### چند نمونه مساله برای لیست پیوندی و آرایه<br><br>
<details>
  <summary> با دریافت کردن یک newNode که data آن عدد است این newNode را در جای مناسب خود در لیست پیوندی sort شده صعودی قرار دهید.  </summary>
 <div dir="ltr">

 ```pseudocode
 
node tmp
tmp = head

if head.data > newNode.data :
    newNode.next = head
    head = newNode
else:
    while tmp.next.data < newNode.data :
        tmp = tmp.next
    newNode.next = tmp.next
    tmp.next = newNode
 
 ```
 </div>

</details>

<details>
  <summary> با پیمایش بر روی یک لیست پیوندی sort شده، node هایی که بخش داده‌ی آن‌‌‌ها تکراری هستند را حذف کنید.  </summary>
 <div dir="ltr">

 ```pseudocode
 
itr = head
While itr->next is not 0:
    if itr->data == itr->next->data:
        dup = itr->next
        itr->next = itr->next->next
        delete dup
    else:
        itr = itr->next
 
 ```
 </div>

</details>

<details>
  <summary> بدون در نظر گرفتن حافظه اضافی و دریافت نشانه‌گر head یک لیست پیوندی، آن لیست را برعکس کنید.  </summary>
 <div dir="ltr">

 ```pseudocode
 
previous = null
current = head
next = null
while(current != null)
{
	next = current.next
	current.next = previous
	previous = current
	current = next
}
head = previous

 ```

</div>

</details>

</div>
