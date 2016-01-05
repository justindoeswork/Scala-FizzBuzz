
object FizzBuzz {
  def main(args: Array[String]){
    for( value <- 1 to 100){
      print(Evaluate(value) + "\n\r");
    }
  }

  def Evaluate( value : Int ) : String = {
    var answer : String = "";

    if(value % 3 == 0 ) {
      answer = answer + "Fizz";
    }

    if(value % 5 == 0 ) {
      answer = answer + "Buzz";
    }

    if(answer == ""){
      answer = value.toString();
    }

    return answer;
  }

}
