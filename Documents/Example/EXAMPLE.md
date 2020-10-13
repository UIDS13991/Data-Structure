<div dir="rtl">

# قالب نمونه سند
## header test
این قالب جهت الگو برداری برای ساخت دیگر اسناد آماده شده است.

موارد قابل توجه در هر سند:
- توجه داشته باشید هر سند باید داری قسمت توضیحات باشد
- در هر سند تا حد امکان از گیف برای اینکه مفهوم را بهتر برسانید استفاده کنید
- برای هر فصل یه فولدر ایجاد کرده و محتویات مورد نیار را درون آن قرار دهید

<img src="gif1.gif">

##### مثال یک گیف

</div>


```

if (isTrue)
  return "yes"
  
```

 ```pseudocode
 
 node tmp
 tmp = head
 while tmp.next.data < newNode.data :
      tmp = tmp.next
 newNode.next = tmp.next
 tmp.next = newNode.next
# TODO
 
 ```
 
```pseudocode
 
itr = head
While itr->next is not 0:
  if itr->data == itr->next->data:
    dup = itr->next
    itr->next = itr->next->next
    delete dup
  else
    itr = itr->next
# TODO
 
 ```
 
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
# TODO
 ```
