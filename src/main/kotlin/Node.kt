//Node클래스는 value값이 next값을 가리키도록 하는 클래스이다.
data class Node<T>(var value:T, var next: Node<T>?=null){//매개변수 value와 next 생성, 매개변수 next는 Node클래스의 객체
    override fun toString() : String {
        return if (next != null) {
            "$value->${next.toString()}"//next.toString() next객체가 가지고 있는 정보를 가져윰
        }else{
            "$value"//value값이 맨 끝일 경우는 value만
        }
    }
}
