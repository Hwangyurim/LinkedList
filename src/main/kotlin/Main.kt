fun main(){
    val list=LinkedList<Int>()//list객체
    list.append(10).append(30).append(20)
    println(list)
    println("Before inserting:$list")
    var middleNode=list.nodeAt(1)!!
    for(i in 1..3){
        middleNode=list.insert(-1*i,middleNode)
    }
    println("After inserting:$list")
}

