 PageRank算法的依据或思想： 
    1，被重要的网页链接的越多（外链）  ，此网页就越重要 
    2，此网页对外的链接越少越重要 
    这两个依据不能是独立的，是需要一起考虑的。但是问题来了，我们怎样判断本网页的外链是很重要的呢？循环判断？那不死循环了？ 
    解决办法是：给定阀值，让循环在此临界处停止。 