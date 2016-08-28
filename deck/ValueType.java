package deck;

public enum ValueType {

  TWO (2),
  THREE (3),
  FOUR (4),
  FIVE (5),
  SIX (6),
  SEVEN (7),
  EIGHT (8),
  NINE (9),
  TEN (10),
  JACK (11),
  QUEEN (12),
  KING (13),
  ACE (1);

private final int valueScore;

ValueType(int valueScore){
  this.valueScore = valueScore;
}


private int valueScore() { return mass; }
    



// private ValueType(int valueScore) {
//   this.valueScore = valueScore;
// }


public int valueScore(int valueScore){
  this.valueScore = valueScore;
}

public int getValueScore(){
  return this.valueScore;
}

}

