val multiply = (x : Double , y : Double) => x * y
multiply ( 2, 3)

def multiply2(x:Double , y : Double) = x * y

val cirf = (d : Double) => multiply(3.14 , d)

cirf(4)


val cirf2 = multiply (3.14, _ : Double)


val cirf3  = (d: Double) => multiply2(3.14 , _)

