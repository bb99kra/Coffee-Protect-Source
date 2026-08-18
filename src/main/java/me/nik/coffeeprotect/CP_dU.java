/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import me.nik.coffeeprotect.CP_PA;
import me.nik.coffeeprotect.CP_xL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_dU {
    private final HashMap<String, Object> CP_x = new HashMap();
    private static final long a = CP_s.a(-6895015336139170863L, -3597889658160185816L, MethodHandles.lookup().lookupClass()).a(250017016030713L);
    private static transient /* synthetic */ String vlGAoBYmEH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_dU() {
    }

    void CP_C(String string, Object object) {
        long l = a ^ 0x3E3E2A8A3AD4L;
        boolean bl = CP_PA.CP_f();
        Object object2 = object;
        if (bl && object2 != null) {
            object2 = this.CP_x.put(string, object);
        }
    }

    public String toString() {
        StringBuilder stringBuilder;
        boolean bl;
        block7: {
            long l = a ^ 0x250579D8A576L;
            StringBuilder stringBuilder2 = new StringBuilder();
            boolean bl2 = CP_PA.CP_y();
            Set<Map.Entry<String, Object>> set = this.CP_x.entrySet();
            stringBuilder2.append("{");
            bl = bl2;
            int n = 0;
            for (Map.Entry<String, Object> entry : set) {
                int n2;
                int n3;
                StringBuilder stringBuilder3;
                block8: {
                    block11: {
                        int n4;
                        Object object;
                        block18: {
                            block16: {
                                block17: {
                                    block14: {
                                        block15: {
                                            block12: {
                                                block13: {
                                                    block9: {
                                                        block10: {
                                                            object = entry.getValue();
                                                            stringBuilder = stringBuilder2.append(this.CP_u(entry.getKey())).append(":");
                                                            if (bl) break block7;
                                                            n4 = object instanceof String;
                                                            if (bl) break block9;
                                                            if (n4 == 0) break block10;
                                                            stringBuilder2.append(this.CP_u(String.valueOf(object)));
                                                            if (!bl) break block11;
                                                        }
                                                        n4 = object instanceof Integer;
                                                    }
                                                    if (bl) break block12;
                                                    if (n4 == 0) break block13;
                                                    stringBuilder2.append(Integer.valueOf(String.valueOf(object)));
                                                    if (!bl) break block11;
                                                }
                                                n4 = object instanceof Boolean;
                                            }
                                            if (bl) break block14;
                                            if (n4 == 0) break block15;
                                            stringBuilder2.append(object);
                                            if (!bl) break block11;
                                        }
                                        n4 = object instanceof CP_dU;
                                    }
                                    if (bl) break block16;
                                    if (n4 == 0) break block17;
                                    stringBuilder2.append(object.toString());
                                    if (!bl) break block11;
                                }
                                n4 = object.getClass().isArray();
                            }
                            if (bl) break block18;
                            if (n4 == 0) break block11;
                            stringBuilder2.append("[");
                            n4 = Array.getLength(object);
                        }
                        int n5 = n4;
                        for (int i = 0; i < n5; ++i) {
                            stringBuilder3 = stringBuilder2;
                            String string = Array.get(object, i).toString();
                            if (!bl) {
                                stringBuilder3 = stringBuilder3.append(string);
                                int n2 = i;
                                n2 = n5 - 1;
                                if (bl) break block8;
                                string = n3 != n2 ? "," : "";
                            }
                            stringBuilder3.append(string);
                            if (!bl) continue;
                        }
                        stringBuilder2.append("]");
                    }
                    stringBuilder3 = stringBuilder2;
                    int n2 = ++n;
                    n2 = set.size();
                }
                stringBuilder3.append(n3 == n2 ? "}" : ",");
                if (!bl) continue;
            }
            stringBuilder = stringBuilder2;
        }
        String string = stringBuilder.toString();
        if (PacketWrapper.CP_z() == null) {
            CP_PA.CP_O(!bl);
        }
        return string;
    }

    private String CP_u(String string) {
        return "\"" + string + "\"";
    }

    CP_dU(CP_xL ilIlxL) {
        this();
    }
}
