val listOne = Seq("a", "b" , "c")
val listTwo = Seq(1,2,3)

// want to create a map from these two lists
listOne.zip(listTwo).toMap
