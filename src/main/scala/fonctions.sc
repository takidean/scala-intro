def square(x:Double):Double=x*x
square(5)
def sumOfSquares(x:Double,y:Double)=square(x)+square(y)
sumOfSquares(4,2)

def euclid(a:Int,b:Int)=a%b
euclid(8,3)

def max(a:Int,b:Int)=if(a>b) a else b
max(2,3)

def sommeInt(a:Int,b:Int):Int=
  if(a>b) 0
else
  a+sommeInt(a+1,b)
sommeInt(1,3)

