/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockFace
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.Action
 *  org.bukkit.event.block.BlockDispenseEvent
 *  org.bukkit.event.block.BlockPistonExtendEvent
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Cz;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class CP_Q7
implements Listener {
    private final CoffeeProtect CP_Z;
    private static final long a = CP_s.a(7091269260521604309L, -5496487350346606120L, MethodHandles.lookup().lookupClass()).a(246881262469687L);
    private static final long b;
    private static final long c;
    private static transient /* synthetic */ String EWEIwbupaI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Q7(CoffeeProtect coffeeProtect) {
        this.CP_Z = coffeeProtect;
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_n(PlayerInteractEvent playerInteractEvent) {
        block9: {
            CP_TM ilIlTM;
            block10: {
                CP_TM ilIlTM2;
                block11: {
                    Block block;
                    PlayerInteractEvent playerInteractEvent2;
                    String[] stringArray;
                    block8: {
                        long l = a ^ 0x22D9BA5BA3BFL;
                        stringArray = CP_vF.CP_o();
                        if (!CP_Oq.REDSTONE_LEVER_FIX.CP_t()) {
                            return;
                        }
                        playerInteractEvent2 = playerInteractEvent;
                        if (stringArray == null) break block8;
                        if (playerInteractEvent2.getAction() == Action.RIGHT_CLICK_BLOCK) break block9;
                        playerInteractEvent2 = playerInteractEvent;
                    }
                    Block block2 = block = playerInteractEvent2.getClickedBlock();
                    if (stringArray != null) {
                        if (block2 == null) {
                            return;
                        }
                        block2 = block;
                    }
                    if (!CP_Cz.CP_r(block2.getType().name(), CP_Cz.LEVER)) break block9;
                    ilIlTM = ilIlTM2 = this.CP_Z.CP_F().CP_R(playerInteractEvent.getPlayer());
                    if (stringArray != null) {
                        if (ilIlTM == null) {
                            return;
                        }
                        ilIlTM = ilIlTM2;
                    }
                    if (stringArray == null) break block10;
                    if (ilIlTM.CP_W() >= c) break block11;
                    playerInteractEvent.setCancelled(true);
                    if (stringArray != null) break block9;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.CP_K();
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_q(BlockPlaceEvent blockPlaceEvent) {
        Block block;
        Block block2;
        long l = a ^ 0x6C032BAE5F5EL;
        String[] stringArray = CP_vF.CP_o();
        if (!CP_Oq.REDSTONE_TRAPDOOR_FIX.CP_t()) {
            return;
        }
        Block block3 = block2 = blockPlaceEvent.getBlock();
        if (stringArray != null) {
            if (!CP_Cz.CP_r(block3.getType().toString(), CP_Cz.REDSTONE)) {
                return;
            }
            block3 = block = block2.getRelative(BlockFace.DOWN);
        }
        if (CP_Cz.CP_r(block.getType().toString(), CP_Cz.TRAPDOOR)) {
            blockPlaceEvent.setCancelled(true);
        }
    }

    /*
     * Exception decompiling
     */
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_l(BlockDispenseEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_f(BlockPistonExtendEvent blockPistonExtendEvent) {
        long l = a ^ 0x6A52DE78726BL;
        String[] stringArray = CP_vF.CP_o();
        boolean bl = CP_Oq.REDSTONE_PISTON_FIX.CP_t();
        if (stringArray != null) {
            if (!bl) {
                return;
            }
            bl = false;
        }
        boolean bl2 = bl;
        for (Block block : blockPistonExtendEvent.getBlocks()) {
            block8: {
                block10: {
                    Material material;
                    block11: {
                        Material material2;
                        Material material3;
                        block9: {
                            material3 = block.getType();
                            boolean bl3 = bl2;
                            if (stringArray != null) {
                                if (!bl3 && material3 == Material.SLIME_BLOCK) {
                                    bl2 = true;
                                    if (stringArray != null) continue;
                                }
                                bl3 = bl2;
                            }
                            if (!bl3) break block8;
                            material = material3;
                            material2 = Material.TNT;
                            if (stringArray == null) break block9;
                            if (material == material2) break block10;
                            material = material3;
                            if (stringArray == null) break block11;
                            material2 = Material.STRING;
                        }
                        if (material == material2) break block10;
                        material = material3;
                    }
                    if (!CP_Cz.CP_r(material.toString(), CP_Cz.RAILS, CP_Cz.TRIPWIRE_HOOK, CP_Cz.OBSERVER, CP_Cz.CARPET)) break block8;
                }
                blockPistonExtendEvent.setCancelled(true);
                return;
            }
            if (stringArray != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4D08E0064E6EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long l2 = 7930289525329268381L;
        byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
        b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = -2268334917248485988L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}
