/**
 * Created by anton on 30.01.17.
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
