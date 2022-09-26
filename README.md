# rock-paper-scissors-game
じゃんけんゲーム

## 一、按如下要求编写Java程序。

编写一个剪刀石头布的猜拳游戏，各个类的要求如下

| 类名 | 说明 |
| --- | --- |
| Hand | 枚举类 
- 有石头剪刀布三个值（请认真命名）
- 石头剪刀布各自有一个int属性（分别对应0，1，2）
- 有一个猜拳的方法  public int fight(Hand h)———(根据输赢分别返回-1，0，1) |
| Player | 实体类，代表玩家
- 有三个属性：名字，得分（赢了得一分，输了不扣分），出拳策略 |
| Strategy（已写好） | 接口，代表出拳策略，已经写好
public interface Strategy {
    Hand nextHand(int round);
} |
| RandomStrategy | 实现了Strategy接口，为随机出拳 |
| SequentialStrategy | 实现了Strategy接口，为石头剪刀布按顺序出拳 |
| Main | 测试类
- 有两个玩家
- 各自按照自己的策略出拳对局10次
- 打印每次出拳记录，并统计分数，公布最终赢家 |
