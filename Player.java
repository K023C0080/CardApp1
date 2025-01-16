public class Player{
  void turn(Card[] cards){
    int rnd = (int)(Math.random()*cards.length);
    return cards[rnd];
  }
}