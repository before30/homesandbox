package cc.before30.codeex.enummeration;

public enum Car {
    AUDI {
        @Override
        public int getPrice() {
            return 25000;
        }
    },
    MERCEDES {
        @Override
        public int getPrice() {
            return 30000;
        }
    },
    BMW {
        @Override
        public int getPrice() {
            return 20000;
        }
    };

    public abstract int getPrice();
}
