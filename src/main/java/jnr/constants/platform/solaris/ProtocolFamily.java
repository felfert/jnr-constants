// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2016-11-03 14:14:20 -0500
package jnr.constants.platform.solaris;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC(0L),
PF_LOCAL(1L),
PF_UNIX(1L),
PF_INET(2L),
PF_IMPLINK(3L),
PF_PUP(4L),
PF_CHAOS(5L),
PF_NS(6L),
// PF_ISO not defined
PF_OSI(19L),
PF_ECMA(8L),
PF_DATAKIT(9L),
PF_CCITT(10L),
PF_SNA(11L),
PF_DECnet(12L),
PF_DLI(13L),
PF_LAT(14L),
PF_HYLINK(15L),
PF_APPLETALK(16L),
PF_ROUTE(24L),
PF_LINK(25L),
// PF_XTP not defined
// PF_COIP not defined
// PF_CNT not defined
// PF_SIP not defined
PF_IPX(23L),
// PF_RTIP not defined
// PF_PIP not defined
// PF_NDRV not defined
// PF_ISDN not defined
PF_KEY(27L),
PF_INET6(26L),
// PF_NATM not defined
// PF_SYSTEM not defined
// PF_NETBIOS not defined
// PF_PPP not defined
// PF_ATM not defined
// PF_NETGRAPH not defined
PF_MAX(33L);
private final long value;
private ProtocolFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 33L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
