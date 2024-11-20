package org.example.stage1;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class AVLTreeTest {

    @Test
    void check() {

        AVLTree tree = new AVLTree();
        for (int i = 0; i < 10; i++) {
            assertFalse(tree.contains(i));
            assertTrue(tree.add(i));
            assertTrue(tree.contains(i));
        }
        for (int i = 0; i < 10; i++) {
            assertTrue(tree.contains(i));
            assertTrue(tree.remove(i));
            assertFalse(tree.contains(i));
        }
    }
}