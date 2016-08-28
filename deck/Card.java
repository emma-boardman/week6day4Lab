package deck; 

public class Card {

  SuitType suit;
  ValueType value;
  // int valueScore;

public Card(SuitType suit, ValueType value, int valueScore){
  this.suit = suit;
  this.value = value;
  this.valueScore = score;
}

public SuitType getSuit(){
  return this.suit;
}

public ValueType getValue(){
  return this.value;
}

public int returnValueScore(){
  return this.valueScore;
}


}