/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.runtime;

public class Options {

    // Features

    public final boolean COVERAGE = org.jruby.util.cli.Options.TRUFFLE_COVERAGE.load();

    // Resources

    public final String CORE_LOAD_PATH = org.jruby.util.cli.Options.TRUFFLE_CORE_LOAD_PATH.load();

    // Data structures

    public final int ARRAY_UNINITIALIZED_SIZE = org.jruby.util.cli.Options.TRUFFLE_ARRAY_UNINITIALIZED_SIZE.load();
    public final int ARRAY_SMALL = org.jruby.util.cli.Options.TRUFFLE_ARRAY_SMALL.load();

    public final int HASH_PACKED_ARRAY_MAX = org.jruby.util.cli.Options.TRUFFLE_HASH_PACKED_ARRAY_MAX.load();

    // Caches

    public final int DISPATCH_CACHE = org.jruby.util.cli.Options.TRUFFLE_DISPATCH_CACHE.load();

    // Cloning and inlining

    public final boolean CORE_ALWAYS_CLONE = org.jruby.util.cli.Options.TRUFFLE_CORE_ALWAYS_CLONE.load();
    public final boolean YIELD_ALWAYS_CLONE = org.jruby.util.cli.Options.TRUFFLE_YIELD_ALWAYS_CLONE.load();
    public final boolean YIELD_ALWAYS_INLINE = org.jruby.util.cli.Options.TRUFFLE_YIELD_ALWAYS_INLINE.load();
    public final boolean METHODMISSING_ALWAYS_CLONE = org.jruby.util.cli.Options.TRUFFLE_METHODMISSING_ALWAYS_CLONE.load();
    public final boolean METHODMISSING_ALWAYS_INLINE = org.jruby.util.cli.Options.TRUFFLE_METHODMISSING_ALWAYS_INLINE.load();

    // Other optimisations

    public final int PACK_UNROLL_LIMIT = org.jruby.util.cli.Options.TRUFFLE_PACK_UNROLL_LIMIT.load();

    // Debugging

    public final int INSTRUMENTATION_SERVER_PORT = org.jruby.util.cli.Options.TRUFFLE_INSTRUMENTATION_SERVER_PORT.load();
    public final boolean EXCEPTIONS_PRINT_JAVA = org.jruby.util.cli.Options.TRUFFLE_EXCEPTIONS_PRINT_JAVA.load();
    public final boolean EXCEPTIONS_PRINT_UNCAUGHT_JAVA = org.jruby.util.cli.Options.TRUFFLE_EXCEPTIONS_PRINT_UNCAUGHT_JAVA.load();
    public final boolean BACKTRACES_HIDE_CORE_FILES = org.jruby.util.cli.Options.TRUFFLE_BACKTRACES_HIDE_CORE_FILES.load();
    public final boolean INCLUDE_CORE_FILE_CALLERS_IN_SET_TRACE_FUNC = org.jruby.util.cli.Options.TRUFFLE_INCLUDE_CORE_FILE_CALLERS_IN_SET_TRACE_FUNC.load();

}