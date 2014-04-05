/*
 * Created by IntelliJ IDEA.
 * User: Return
 * Date: 05/04/14
 * Time: 22:23
 */
package org.ipfilter.injector;

import com.google.inject.AbstractModule;
import org.ipfilter.Filters.Filter;
import org.ipfilter.Filters.SafeFilter;
import org.ipfilter.Filters.UnsafeFilter;

public class SafeModule extends AbstractModule {
    protected void configure() {
        bind(Filter.class).to(UnsafeFilter.class).asEagerSingleton();
        bind(Filter.class).to(SafeFilter.class).asEagerSingleton();
    }
}