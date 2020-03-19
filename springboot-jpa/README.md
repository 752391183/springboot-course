#Springboot课程设计

实现毕业设计双向的选择

教师类：

1.登录：导入多门课程成绩单EXCEL表格（前端CS实现）

2.为课程设置最低分数和权重：保密算法

3.设置实际指导学生的数量

4.设置加权后，有资格学生数量范围

5.查看当前已接收学生

6.各参数皆可修改


学生类：

1.输入学号：载入曾经选修的课程

2.提交和提醒确认

3.匹配，返回成功的说明，同时进行更新数据；不匹配，返回友好的失败提醒信息

4.达到最大的数后，关闭提交，显示友好的提醒信息

5.后台并发判断(当多人同时提交时，如何进行数据的处理)


/*

设计整体思想：

*/

学生与老师是多对一的关系

课程与学生之间是多对多的关系，需要建立课程与学生之间的中间表来表示他们之间的关系

学生和课程方向之间是多对多的关系，也需要建立学生和方向之间的中间表来表示他们之间的关系


/*

表情况

*/

学生(Students):主键(int):id 名字(String):name  是否被选中(Boolean):whetherSelected

课程(Course)：主键(int):id 课程名(String)：name 权值(int)：value  课程最低分(int):mixGrade

老师(Teacher):主键(int):id 教师名(String)：name 可以选择学生的数量(int):selectNumber 登陆账号(int):password

方向(Direction):主键(int):id 课程名(String)：name 方向的权重(int):value

学生与课程之间的中间表(Elective):主键(int):id 具体信息(String):detail 课程成绩(int):grade

学生与方向之间的中间表(DirectionElective):主键(int):id 具体信息(String):detail

/*

过程中遇到的错误：

*/

1.将Students表中主键学号弄成了自增长，测试时又重新输入了学号，导致异常




