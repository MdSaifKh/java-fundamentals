Generic class: A class can refer to any type is known as a generic class. In this code we are using the T type parameter to create generic class of specific type.
Generic method: Like generic class, we can create generic method which can accept any type argument and return any type of argument

T -> type
E -> element
K -> key
V -> value
N -> Number

In collection also we use generic class for eg ArrayList<Integer>, HashSet<Integer>
class can use multiple generic type, example Map<Integer,String>

Wildcards: The ? symbol represent wildcards which refers any child class of it parent.
For example <? extends Number> represent any child of Number class like Integer, Float, Double
