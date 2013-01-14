package junit.tutorial.dao;

import static junit.tutorial.ITableMatcher.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import junit.tutorial.DbUnitTester;
import junit.tutorial.H2DatabaseServer;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class UserDaoTest {

    public static class usersに2件のレコードがある場合 {
        @ClassRule
        public static H2DatabaseServer server = new H2UtDatabaseServer();
        @Rule
        public DbUnitTester tester = new UserDaoDbUnitTester("fixtures.xml");
        UserDao sut;

        @Before
        public void setUp() throws Exception {
            this.sut = new UserDao();
        }

        @Test
        public void getListで2件取得できる事() throws Exception {
            // Exercise
            List<String> actual = sut.getList();
            // Verify
            assertThat(actual, is(notNullValue()));
            assertThat(actual.size(), is(2));
            assertThat(actual.get(0), is("Ichiro"));
            assertThat(actual.get(1), is("Jiro"));
        }

        @Test
        public void insertで1件追加できる() throws Exception {
            // Exercise
            sut.insert("Saburou");
            // Verify
            ITable actual =
                    tester.getConnection().createDataSet().getTable("users");
            InputStream expectedIn =
                    getClass().getResourceAsStream("expected.xml");
            ITable expected =
                    new FlatXmlDataSetBuilder().build(expectedIn).getTable(
                        "users");
            assertThat(actual, is(tableOf(expected)));
        }
    }

    public static class usersに0件のレコードがある場合 {
        @ClassRule
        public static H2DatabaseServer server = new H2UtDatabaseServer();
        @Rule
        public DbUnitTester tester = new UserDaoDbUnitTester(
            "zero_fixtures.xml");

        UserDao sut;

        @Before
        public void setUp() throws Exception {
            this.sut = new UserDao();
        }

        @Test
        public void getListで0件取得できる事() throws Exception {
            // Exercise
            List<String> actual = sut.getList();
            // Verify
            assertThat(actual, is(notNullValue()));
            assertThat(actual.size(), is(0));
        }

        @Test
        public void insertで1件追加できる() throws Exception {
            // Exercise
            sut.insert("Sirou");
            // Verify
            ITable actual =
                    tester.getConnection().createDataSet().getTable("users");
            InputStream expectedIn =
                    getClass().getResourceAsStream("zero_expected.xml");
            ITable expected =
                    new FlatXmlDataSetBuilder().build(expectedIn).getTable(
                        "users");
            assertThat(actual, is(tableOf(expected)));
        }
    }

    static class H2UtDatabaseServer extends H2DatabaseServer {
        public H2UtDatabaseServer() {
            super("h2", "db", "ut");
        }
    }

    static class UserDaoDbUnitTester extends DbUnitTester {
        private final String fixture;

        public UserDaoDbUnitTester(String fixture) {
            super(
                "org.h2.Driver",
                "jdbc:h2:tcp://localhost/db;SCHEMA=ut",
                "sa",
                "",
                "ut");
            this.fixture = fixture;
        }

        @Override
        protected void before() throws Exception {
            executeQuery("DROP TABLE IF EXISTS users");
            executeQuery("CREATE TABLE users(id INT AUTO_INCREMENT, name VARCHAR(64))");
        }

        @Override
        protected IDataSet createDataSet() throws Exception {
            return new FlatXmlDataSetBuilder().build(getClass()
                .getResourceAsStream(fixture));
        }
    }
}
