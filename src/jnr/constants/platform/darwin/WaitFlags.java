// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:13 +1000
package jnr.constants.platform.darwin;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x1L),
WUNTRACED(0x2L),
WSTOPPED(0x8L),
WEXITED(0x4L),
WCONTINUED(0x10L),
WNOWAIT(0x20L);
private final long value;
private WaitFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x20L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
}