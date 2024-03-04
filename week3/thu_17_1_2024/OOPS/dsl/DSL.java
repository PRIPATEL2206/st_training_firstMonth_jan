package dsl;

class DSL {
    private String selectClause = "";
    private String fromClause = "";
    private String whereClause = "";

    public SelectBuilder select(String columns) {
        this.selectClause = columns;
        return new SelectBuilder(this);
    }

    static class SelectBuilder {
        private final DSL DSL;

        public SelectBuilder(DSL DSL) {
            this.DSL = DSL;
        }

        public FromBuilder from(String table) {
            DSL.fromClause = table;
            return new FromBuilder(DSL);
        }
    }

    static class FromBuilder {
        private final DSL DSL;

        public FromBuilder(DSL DSL) {
            this.DSL = DSL;
        }

        public DSL where(String condition) {
            DSL.whereClause = condition;
            return DSL;
        }
    }

    @Override
    public String toString() {
        return "SELECT " + selectClause + " FROM " + fromClause +
               (!whereClause.isEmpty() ? " WHERE " + whereClause : "");
    }

    public static void main(String[] args) {
        DSL DSL = new DSL();
        String query = DSL
                .select("name, age")
                .from("users")
                .where("age > 30")
                .toString();

        System.out.println(query);
    }
}

