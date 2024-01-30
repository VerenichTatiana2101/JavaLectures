public class Main {

    /**
     * Перечисления
     * Кроме восьми примитивных типов данных и классов в Java есть специальный тип,
     * выведенный на уровень синтаксиса языка – enum или перечисление. П
     */
    enum Color {
        RED("#FF0000"), GREEN("00FF00"), BLUE("0000FF");

        private String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }

    /**
     * Внутренние и вложенные классы
     */
    public class Orange {
        private Juice juice;

        public Orange() {
            this.juice = new Juice();
        }

        public void squizeJuice() {
            System.out.println("Squeeze juice...");
            juice.flow();
        }

        private class Juice {
            public void flow() {
                System.out.println("Juice dripped...");
            }
        }
    }

    public static void main(String[] args) {
        for (Color s : Color.values()) {
            System.out.printf("%s(%s) ", s, s.getCode());
        }

        Orange orange = new Orange();
        orange.squizeJuice();

    }

}
