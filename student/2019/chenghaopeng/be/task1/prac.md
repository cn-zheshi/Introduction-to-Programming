# 9
第一段可以。不同的参数列表相当于不同的函数，在函数被调用时，编译器会自动选择与形参类型符合的函数执行。

第二段不可以。参数列表相同则无法区分同名的函数。

# 10
调用了子类的run方法

# 11
先构造父类，再构造子类

# 12
Animal接口定义了一个全体动物通用的行为，Cat和Dog分别继承了Animal的行为，同时又可以定义个性化的行为。Cat和Dog都是Animal继承来的，所以Cat和Dog对象都可以用Animal来表示。

# 13
只需要关心接口如何使用，而忽略接口实现的具体细节

提高代码复用率

降低修改代码造成的风险

# 14
除了不能实例化，抽象类和普通类一样

接口只能声明，不能实现。不能有构造器。只能用public修饰。接口在被实现时，所有声明的方法都要被实现。接口只能继承接口