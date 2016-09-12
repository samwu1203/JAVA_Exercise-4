These are JAVA code for exercise

1.	繼承、多型與修飾子的練習-Employee
有一小公司，其人事薪資的制度如下：
公司每個員工皆有姓名、性別、到職日、電話和住址等基本資料。
一般職員只有本薪；一級主管則另有本薪、午餐津貼、交通津貼和職務加給；二級主管則有本薪、午餐津貼和職務加給。午餐津貼為1800元，交通津貼為2000元，職務加給一級主管為5000元，二級主管為3000元。
每個員工皆有可能加班，加班費為本薪除以240乘以1.5倍再乘以加班時數。
在main()中產生六個實例分別為一級主管、二級主管及一般職員且分有加班及無加班兩種(資料直接透過建構子hard code在程式中)，並列印其基本資料及當月薪資。

2.	介面的練習-Shape
有一interface名為Shape，內有兩個成員方法：一為計算面積computeArea()，另為計算周長computeCircumference()。
寫兩個類別分別為Circle和Rectangle，用以實作上述介面，並驗証結果。

3.	例外處理的練習-Stack
產生一個class名為Stack，有兩個成員變數分別為一int陣列(用以存放資料)和top(int) (用以標示目前最上層資料的註標值)；有兩個成員方法push()和pop()，分別用來放資料和取資料。
產生兩個exception class名為StackEmptyException和StackFullException，分別用來處理Stack空的和滿的狀況。
提示：Stack以先進後出(First In Last Out)的方式存取資料。

