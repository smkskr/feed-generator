package enums;

public enum RankingWeights {

    LIKES(0.2F),
    COMMENT(0.5F),
    SHARE(0.7F);

    private float value;

    private RankingWeights(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
