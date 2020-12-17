def  fine(a:List[Int]):Int=
  if(a.length==1) a(0)
  else fine(a.tail)

var nums: List[Int] = List(1, 2, 3, 4)

var result=fine(nums)
result