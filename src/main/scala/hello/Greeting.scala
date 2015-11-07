package hello

case class Greeting(var id:Long, var content:String){
	def getId = id
	def setId(_id:Long) = id = _id
	def getContent = content
	def setContent(_content:String) = content = _content
}
