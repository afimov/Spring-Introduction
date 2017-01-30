/**
 * Created by anton on 30.01.17.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
