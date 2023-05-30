package Collection;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    public CollectionTest() {
    }

    public CollectionTest(boolean b, boolean c, boolean d, boolean e, boolean f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }
}
