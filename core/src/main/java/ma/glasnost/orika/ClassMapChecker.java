package ma.glasnost.orika;

import ma.glasnost.orika.metadata.ClassMap;

/**
 * 映射检查器
 */
public interface ClassMapChecker {

    /**
     * 检查类映射,检查抛异常
     */
    void check(final ClassMap<?, ?> classMap);
}
