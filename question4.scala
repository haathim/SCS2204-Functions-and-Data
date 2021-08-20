object question4 extends App{

    var bank:List[Account] = List(new Account("1", 1, -500), new Account("2", 2, 9500), new Account("3", 3, -2500), new Account("4", 4, -3500), new Account("5", 5, 100))

    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

    val balance = (b:List[Account]) => b.map(x => x.balance).reduce((x,y) => x + y)

    val interest = (b:List[Account]) => b.map(x => x.addInterest())

    println(overdraft(bank))
    println(balance(bank))
    println(interest(bank))
}



class Account(id:String,n: Int, b: Double) {

    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
    def withdraw(a:Double) = {this.balance = this.balance - a}
    def deposit(a:Double) = {this.balance = this.balance + a}
    def transfer(a:Account,b:Double) = {this.withdraw(b); a.deposit(b)}
    def addInterest():Double = {
        if(this.balance > 0){
            return balance*1.05
        }
        else{
            return balance*1.1
        }
    }
    
}