// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:14 +1000
package jnr.constants.platform;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG,
WUNTRACED,
WSTOPPED,
WEXITED,
WCONTINUED,
WNOWAIT,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<WaitFlags> resolver = 
ConstantResolver.getBitmaskResolver(WaitFlags.class);
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static WaitFlags valueOf(long value) { 
    return resolver.valueOf(value);
}
}
