package top.daheizi.commons.fight.event;

import java.util.ArrayList;
import java.util.List;

import top.daheizi.commons.fight.unit.DefaultAIUnit;

/**
 * 添加战斗单元事件
 * @author daheizi
 * @Date 2016年7月17日 上午12:51:09
 */
public class AddUnitEvent extends FightEvent {

    /** 要添加的战斗单元列表 */
    public List<DefaultAIUnit> heroList = new ArrayList<>();;


}
