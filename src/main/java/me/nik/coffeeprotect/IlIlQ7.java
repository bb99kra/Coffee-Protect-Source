/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlCz;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
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

public class IlIlQ7
implements Listener {
    private final CoffeeProtect IlIlZ;
    private static final long a = IlIls.a((long)7091269260521604309L, (long)-5496487350346606120L, MethodHandles.lookup().lookupClass()).a(246881262469687L);
    private static final long b;
    private static final long c;
    private static transient /* synthetic */ String EWEIwbupaI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQ7(CoffeeProtect coffeeProtect) {
        this.IlIlZ = coffeeProtect;
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIln(PlayerInteractEvent playerInteractEvent) {
        block9: {
            IlIlTM ilIlTM;
            block10: {
                IlIlTM ilIlTM2;
                block11: {
                    Block block;
                    PlayerInteractEvent playerInteractEvent2;
                    String[] stringArray;
                    block8: {
                        long l = a ^ 0x22D9BA5BA3BFL;
                        stringArray = IlIlvF.IlIlo();
                        if (!IlIlOq.REDSTONE_LEVER_FIX.IlIlt()) {
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
                    if (!IlIlCz.IlIlr(block2.getType().name(), IlIlCz.LEVER)) break block9;
                    ilIlTM = ilIlTM2 = this.IlIlZ.IlIlF().IlIlR(playerInteractEvent.getPlayer());
                    if (stringArray != null) {
                        if (ilIlTM == null) {
                            return;
                        }
                        ilIlTM = ilIlTM2;
                    }
                    if (stringArray == null) break block10;
                    if (ilIlTM.IlIlW() >= c) break block11;
                    playerInteractEvent.setCancelled(true);
                    if (stringArray != null) break block9;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.IlIlK();
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIlq(BlockPlaceEvent blockPlaceEvent) {
        Block block;
        Block block2;
        long l = a ^ 0x6C032BAE5F5EL;
        String[] stringArray = IlIlvF.IlIlo();
        if (!IlIlOq.REDSTONE_TRAPDOOR_FIX.IlIlt()) {
            return;
        }
        Block block3 = block2 = blockPlaceEvent.getBlock();
        if (stringArray != null) {
            if (!IlIlCz.IlIlr(block3.getType().toString(), IlIlCz.REDSTONE)) {
                return;
            }
            block3 = block = block2.getRelative(BlockFace.DOWN);
        }
        if (IlIlCz.IlIlr(block.getType().toString(), IlIlCz.TRAPDOOR)) {
            blockPlaceEvent.setCancelled(true);
        }
    }

    /*
     * Exception decompiling
     */
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIll(BlockDispenseEvent var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIlf(BlockPistonExtendEvent blockPistonExtendEvent) {
        long l = a ^ 0x6A52DE78726BL;
        String[] stringArray = IlIlvF.IlIlo();
        boolean bl = IlIlOq.REDSTONE_PISTON_FIX.IlIlt();
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
                    if (!IlIlCz.IlIlr(material.toString(), IlIlCz.RAILS, IlIlCz.TRIPWIRE_HOOK, IlIlCz.OBSERVER, IlIlCz.CARPET)) break block8;
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

