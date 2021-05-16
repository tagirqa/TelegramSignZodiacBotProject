public enum Link {
    ARIES("https://horo.mail.ru/prediction/aries/today/"),
    TAURUS("https://horo.mail.ru/prediction/taurus/today/"),
    GEMINI("https://horo.mail.ru/prediction/gemini/today/"),
    CANCER("https://horo.mail.ru/prediction/cancer/today/"),
    LEO("https://horo.mail.ru/prediction/leo/today/"),
    VIRGO("https://horo.mail.ru/prediction/virgo/today/"),
    LIBRA("https://horo.mail.ru/prediction/libra/today/"),
    SCORPIO("https://horo.mail.ru/prediction/scorpio/today/"),
    SAGITTARIUS("https://horo.mail.ru/prediction/sagittarius/today/"),
    CAPRICORN("https://horo.mail.ru/prediction/capricorn/today/"),
    AQUARIUS("https://horo.mail.ru/prediction/aquarius/today/"),
    PISCES("https://horo.mail.ru/prediction/pisces/today/");

    private String text;

    Link(String text) {
        this.text = text;
    }

    public String doLink() {
        return this.text;
    }
}

