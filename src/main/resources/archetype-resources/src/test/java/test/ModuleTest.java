#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import ${package}.ModuleObject;

import org.junit.Test;

/**
 * Tests the module.
 */
public class ModuleTest {

    /**
     * Tests the module method.
     */
    @Test
    public void testMethod() {
        new ModuleObject().method();
    }
}