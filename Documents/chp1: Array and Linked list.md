<div dir="rtl">

# بخش اول : لیست پیوندی و آرایه
### لیست پیوندی - (Linked List)

لیست پیوندی شامل مجموعه ای از المان هاست که آن ها را با `node` میشناسیم و 
هرکدام از این `node` ها<br>
با کمک یک اشاره گر 
 به نام `next` به `node` بعدی متصل شده است.(مانند شکل زیر) <br><br>
<img src = "Linkedlist.png"> <br>
هر`node` علاوه بر اشاره گر `next` که برای وصل شدن به `node` بعدی استفاده میشود دارای ویژگی به نام `data` است که
<br>اطلاعات آن `node` را در خود نگه میدارد.
جنس این اطلاعات با توجه به تعریف `node` میتواند هرچیزی (string , int , ... ) باشد. <br><br>
در لیست پیوندی`head` اشاره گری است که به اولین `node` لیست پیوندی اشاره میکند و برای پیمایش و دسترسی به بقیه ی `node` ها <br>
باید از `head` شروع کرده و با کمک اشاره گر های `next` به جلو رفته تا به `node` مورد نظر خود برسیم. <br>
به عبارت دیگر بر خلاف آرایه دیگر با کمک اندیس نمیتوانیم به اطالاعات هر خانه دسترسی پیدا کنیم.<br>
در لیست پیوندی اشاره گر `next` آخرین `node` به `null` اشاره میکند که نشان دهنده ی پایان لیست پیوندی است. <br><br>
برای اضافه کردن یا حذف کردن یک `node` از لیست پیوندی باید به این موارد توجه داشت :<br>  

1- اشاره گر `head` همیشه به اولین `node` اشاره کند.<br>
2- اشاره گر `next` آخرین `node` به `null` اشاره کند.<br>
3- از اول تا آخر لیست زنجیره متصل بماند.<br>

<details>
  <summary> اضافه کردن node به ابتدای لیست پیوندی  </summary>
  <img src = "Linkedlist_insert_at_start.png"> <br>
</details>

<details>
  <summary> اضافه کردن node به اواسط لیست پیوندی  </summary>
  <img src = "Linkedlist_insert_middle.png"><br>
</details>

<details>
  <summary> اضافه کردن node به آخر لیست پیوندی  </summary>
  <img src = "Linkedlist_insert_last.png">
</details>

<details>
  <summary> حذف کردن node از لیست پیوندی  </summary>
  <img src = "Linkedlist_deletion.png">
</details>
<br><br><br>

- **چند نمونه مساله برای لیست پیوندی** <br><br>
<details>
  <summary> با دریافت کردن یک newNode که data آن عدد است این newNode را در جای مناسب خود در لیست پیوندی sort شده قرار دهید.  </summary>
 
 ```
 
 
 ```
</details>



</div>
