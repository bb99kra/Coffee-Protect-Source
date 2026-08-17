# ☕ CoffeeProtect

An advanced next-generation anti-crash and exploit protection plugin for Minecraft servers.

## 🚀 Features
- **Book Exploit Protection**: Prevents malicious JSON translation crashes, oversized pages, and infinite NBT compound tags.
- **Sign Exploit Protection**: Blocks injected `/op` or `/execute` clickEvents and character overflows.
- **Creative Slot & Item Protection**: Checks NBT compound depth, illegal enchantments, and malicious skull URLs.
- **Custom Payload Protection**: Limits channel registration flood and buffers.
- **Window Click Protection**: Prevents impossible inventory slot clicks and packet spam.
- **Movement & Coordinate Protection**: Blocks NaN / Infinity coordinates and extreme teleport crash packets.
- **Redstone Lag Protection**: Automatically throttles runaway redstone clocks and chunk lag machines.

## 🛠️ Building from Source
This project uses standard Maven.

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/CoffeeProtect.git

# Navigate to project directory
cd CoffeeProtect

# Build JAR package
mvn clean package
```

The compiled JAR will be in `target/CoffeeProtect-2.5.6.jar`.

## 📦 Compatibility
- **Server Versions**: 1.20 - 1.21.x
- **Platforms**: Paper, Purpur, Leaf, Folia
- **Dependencies**: PacketEvents 2.x
