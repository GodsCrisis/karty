import java.util.ArrayList;
import java.util.List;

public class CardRepository {
        private List<Card> cardList = new ArrayList<>();

        public List<Card> getCardList () {
            return cardList;
        }

        public void save (Card card){
            cardList.add(card);
        }
    }
