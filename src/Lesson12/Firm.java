package Lesson12;

public class Firm {

    private final String name = "Фирма";

    public String getName() {
        return name;
    }

    public class Internal {
        private final String name = "Внутренняя фирма ";

        public String getName() {
            return name;
        }
    }

    public static class SalesDepartment {
        private final String name = "Отдел продаж";

        public String getName() {
            return name;
        }
    }
}
