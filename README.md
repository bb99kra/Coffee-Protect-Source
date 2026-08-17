# ☕ Coffee Protect Nguyen

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange.svg)
![Minecraft](https://img.shields.io/badge/Minecraft-1.20--1.21.x-brightgreen.svg)
![Platform](https://img.shields.io/badge/Platform-Paper%20%7C%20Leaf%20%7C%20Purpur%20%7C%20Folia-blue.svg)
![PacketEvents](https://img.shields.io/badge/PacketEvents-2.13.0-purple.svg)
![Author](https://img.shields.io/badge/Author-Nguyen%20(bb99kra)-gold.svg)

**Next-Generation Anti-Crash, Packet Filter & Exploit Protection Plugin for High-Performance Minecraft Networks.**

</div>

---

## 🌟 Giới thiệu (Overview)

**Coffee Protect Nguyen** là giải pháp bảo mật và chống crash toàn diện dành cho máy chủ Minecraft hiện đại (hỗ trợ đầy đủ từ **Minecraft 1.20 đến 1.21.x**, bao gồm Paper, Purpur, Leaf và Folia).

Plugin sử dụng kiến trúc chặn gói tin tầng mạng trực tiếp thông qua **PacketEvents 2.13.0 API**, giúp phát hiện và vô hiệu hóa ngay lập tức các packet độc hại trước khi chúng kịp gây lag hay sập server.

---

## 🛡️ Các tính năng bảo vệ chính (Core Features)

| Mô-đun | Chức năng chi tiết |
| :--- | :--- |
| 📖 **Book Exploit Protection** | Giới hạn số trang sách, byte mỗi trang, tổng dung lượng sách và ngăn chặn toàn bộ các mã JSON dịch thuật độc hại (`translation.test.invalid`, `run_command`). |
| 🪧 **Sign Exploit Protection** | Giới hạn độ dài ký tự trên biển, phát hiện và hủy ngay lập tức các lệnh ẩn dạng `clickEvent` (`/op`, `/execute`). |
| 🎒 **Creative Slot / NBT Check** | Kiểm tra độ sâu phân cấp đệ quy NBT Compound (`max_nbt_depth`), ngăn chặn Skull URL độc hại và enchant bất hợp pháp. |
| 📡 **Custom Payload Protection** | Chặn flood kênh tin nhắn mạng (Payload buffer overflow) và nhận diện Client Brand của người chơi. |
| 🪟 **Window Click Protection** | Chặn spam click kho đồ siêu tốc, chặn click vào các slot số âm hoặc slot ảo không tồn tại. |
| 🏃 **Movement & Coordinate Check** | Phát hiện và chặn các gói tin di chuyển chứa tọa độ `NaN` (Not-a-Number), `Infinity` hoặc dịch chuyển vượt biên giới gây crash thế giới. |
| 🔴 **Redstone Lag Protection** | Giám sát tần số kích hoạt Redstone trong từng tick, tự động ngắt các cỗ máy tạo lag (Clock lag / Lag machine). |
| 📊 **Discord Webhook Alerts** | Tự động gửi Embed cảnh báo vi phạm kèm TPS server theo thời gian thực về kênh Discord của Staff. |
| 🖥️ **Admin GUI & PlaceholderAPI** | Menu tương tác trực quan bật/tắt module ngay trong game (`/cp menu`) và hỗ trợ đầy đủ các biến PlaceholderAPI (`%coffeeprotect_...%`). |

---

## 📋 Lệnh & Quyền hạn (Commands & Permissions)

| Lệnh | Mô tả | Quyền hạn |
| :--- | :--- | :--- |
| `/cp` | Hiển thị bảng hướng dẫn lệnh | `coffeeprotect.admin` |
| `/cp stats` | Xem tổng số lượng packet độc hại đã chặn | `coffeeprotect.admin` |
| `/cp menu` | Mở menu GUI cài đặt và bật/tắt module | `coffeeprotect.admin` |
| `/cp reload` | Tải lại toàn bộ cấu hình chỉ trong 2ms | `coffeeprotect.admin` |
| `/cp info <player>` | Xem điểm vi phạm và Client Brand của người chơi | `coffeeprotect.admin` |
| `/cp alerts` | Bật/tắt nhận thông báo cảnh báo in-game | `coffeeprotect.alerts` |

---

## 🛠️ Hướng dẫn Tự Build (Build from Source)

Dự án được cấu hình chuẩn **Maven**:

```bash
# 1. Clone kho lưu trữ
git clone https://github.com/bb99kra/Coffee-Protect-Source.git

# 2. Di chuyển vào thư mục dự án
cd Coffee-Protect-Source

# 3. Biên dịch file JAR
mvn clean package
```

File `.jar` thành phẩm sẽ xuất hiện tại thư mục `target/CoffeeProtect-2.5.6.jar`.

---

## 👨‍💻 Tác giả & Bản quyền (Credits)
* **Author**: Nguyen ([@bb99kra](https://github.com/bb99kra))
* **Compatibility**: Minecraft 1.20 - 1.21.x (Paper, Leaf, Purpur, Folia).
