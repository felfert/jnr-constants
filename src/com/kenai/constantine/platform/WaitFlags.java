// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Jan 23 18:48:41 +1000 2009
package com.kenai.constantine.platform;
public enum WaitFlags implements com.kenai.constantine.Constant {
WNOHANG,
WUNTRACED,
WSTOPPED,
WEXITED,
WCONTINUED,
WNOWAIT,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<WaitFlags> resolver 
= ConstantResolver.getResolver(WaitFlags.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static WaitFlags valueOf(int value) { 
    return resolver.valueOf(value);
}
}