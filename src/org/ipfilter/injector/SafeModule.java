/*
 * Created by IntelliJ IDEA.
 * User: Return
 * Date: 05/04/14
 * Time: 22:23
 */
package org.ipfilter.injector;

import com.google.inject.AbstractModule;
import org.ipfilter.core.filters.Filter;
import org.ipfilter.core.filters.SafeFilter;
import org.ipfilter.core.filters.UnsafeFilter;

public class SafeModule extends AbstractModule {
    protected void configure() {
        bind(Filter.class).to(UnsafeFilter.class).asEagerSingleton();
        bind(Filter.class).to(SafeFilter.class).asEagerSingleton();
    }
}
