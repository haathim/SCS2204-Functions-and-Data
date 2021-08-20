object question3 extends App{
    val accountA = new Account("1", 1, 5000)
    val accountB = new Account("2", 2, 2000)
    println(accountA)
    println(accountB)
    println("Transferring......")
    accountA.transfer(accountB, 1500)
    println(accountA)
    println(accountB)
    
}

class Account(id:String,n: Int, b: Double) {

    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
    def withdraw(a:Double) = {this.balance = this.balance - a}
    def deposit(a:Double) = {this.balance = this.balance + a}
    def transfer(a:Account,b:Double) = {this.withdraw(b); a.deposit(b)}
}