public class Game {
  Player p;
  Card[] cards;

Game() {
  p = new Player();

  cards = new Card[52];
  String[] marks = {"♠", "♡", "♦", "♧"};
  for (int i=0 ; i<52 ; i++){
    Card c = new Card();
    cards[i] = c;
  }
}



  void start(){
    Card c = p.turn(cards);
    c.open();
    judge(c);
  }
  void judge(Card c){
    if 
  }
}
