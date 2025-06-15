package com.wan3761.GameObjects.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */
public enum GameRole {
    ATTACKER,BREAKER,BUFFER,DEBUFFER,BLASTER,HEALER,DEFENDER,ADMIRAL,@JsonEnumDefaultValue OTHER
}
