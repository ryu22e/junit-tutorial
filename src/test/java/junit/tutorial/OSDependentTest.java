package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;

import junit.tutorial.RunOn.OS;

import org.junit.Rule;
import org.junit.Test;

public class OSDependentTest {
    @Rule
    public OSDependent osDependent = new OSDependent();

    @Test
    @RunOn(OS.WINDOWS)
    public void onlyWindows() throws Exception {
        System.out.println("test: onlyWindows");
        assertThat(File.separator, is("¥¥"));
    }

    @Test
    @RunOn(OS.MAC)
    public void onlyMac() throws Exception {
        System.out.println("test: onlyMac");
        assertThat(File.separator, is("/"));
    }
}
