#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static java.util.logging.Level.SEVERE;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;

/**
 * This provides a test to check certain properties of a utility class.
 * Primarily that it has only one private constructor and no non-static methods
 * and it is final.
 * 
 * @author Archimedes Trajano
 */
public final class UtilityClassTestUtil {
    /**
     * Logger.
     */
    private static final Logger log = Logger.getLogger(
            UtilityClassTestUtil.class.getName(),
            "${package}.Messages");

    /**
     * Verifies that a utility class is well defined.
     * 
     * @param clazz
     *            utility class to verify.
     */
    public static void assertUtilityClassWellDefined(final Class<?> clazz) {
        assert Modifier.isFinal(clazz.getModifiers());
        assert clazz.getDeclaredConstructors().length == 1;
        try {
            final Constructor<?> constructor = clazz.getDeclaredConstructor();
            if (constructor.isAccessible()
                    || !Modifier.isPrivate(constructor.getModifiers())) {
                log.log(SEVERE,
                        "UtilityClassTestUtil.constructorNotPrivate", constructor); //${symbol_dollar}NON-NLS-1${symbol_dollar}
                assert false;
            }
            constructor.setAccessible(true);
            constructor.newInstance();
            constructor.setAccessible(false);
            for (final Method method : clazz.getMethods()) {
                if (!Modifier.isStatic(method.getModifiers())
                        && method.getDeclaringClass().equals(clazz)) {
                    log.log(SEVERE,
                            "UtilityClassTestUtil.methodNotStatic", method); //${symbol_dollar}NON-NLS-1${symbol_dollar}
                    assert false;
                }
            }
        } catch (final NoSuchMethodException e) {
            throw new TestingException(e);
        } catch (final InstantiationException e) {
            throw new TestingException(e);
        } catch (final IllegalAccessException e) {
            throw new TestingException(e);
        } catch (final InvocationTargetException e) {
            throw new TestingException(e);
        }
    }

    /**
     * Prevent instantiation of utility class.
     */
    private UtilityClassTestUtil() {
    }
}
