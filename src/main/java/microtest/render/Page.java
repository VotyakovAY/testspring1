package microtest.render;

import microtest.service.Database;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:42
 * Declaration: All Rights Reserved !!!
 */
public class Page{

    private Database database;


    public void render() {
        if (database == null) {
            throw new RuntimeException(
                    "You must set the property database of class:"
                            + Page.class.getName());
        }

        System.out.println(database.getPerson());
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }
}
